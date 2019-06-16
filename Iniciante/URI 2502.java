package Iniciante;

/*
 
 QUESTÃO
 A cifra mais antiga conhecida é a Cifra de César. César escrevia suas cartas 
 trocando cada letra pela próxima do alfabeto, para evitar que, quando a 
 carta fosse interceptada, conseguissem ler. Com o tempo, a criptografia 
 adquiriu melhor qualidade, mas a criptografia por substituição ainda é uma 
 brincadeira de criança interessante, por exemplo:

								ZENIT
								POLAR

 Neste tipo de brincadeira, ao escrever uma carta a letra Z é trocada pela 
 letra P e vice versa, bem como: E e O e assim sucessivamente. A frase cifrada 
 desta forma: "Osro roxre osri caftide" pode ser decifrada como: "Este texto 
 esta cifrado". Como a brincadeira ficou séria, a você foi solicitado um 
 programa que decifre as mensagens cifradas a partir de uma chave fornecida.
 
 ENTRADA
 A entrada contém vários casos de teste. Cada caso de teste começa com uma 
 linha indicando dois números inteiros C e N, 0 < C < 21 e 0 < N < 100. C é 
 o tamanho da cifra. Nas duas linhas seguintes está a cifra de tamanho C 
 indicando quais caracteres da primeira linha será substituído por caracteres 
 da segunda linha, um caracter aparece uma única vez, na primeira ou na segunda 
 linha.

 A cifra pode conter letras de ‘A’ a ‘Z’, números de ‘0’ a ‘9’ além do espaço 
 em branco e alguns símbolos de pontuação: '.' ',' ';' ':' '(' ')' '!' e '?'. 
 Nas próximas N linhas estão frases e sentenças criptografadas pela cifra 
 fornecida, que você deve decifrar. Cada linha contém no mínimo 1 e no máximo 
 1000 caracteres. São permitidos quaisquer caracteres ASCII (não extendido) 
 imprimíveis, neste caso não estão presentes nenhum caracter acentuado, nem 
 mesmo 'ç'.
 
 SAÍDA
 Para cada caso de teste da entrada seu programa deve gerar para cada linha de 
 frase e sentença de entrada, uma linha com a saída decifrada, respeitando a 
 capitalização da letra (letras maiúsculas são decifradas como maiúsculas e 
 minúsculas como minúsculas quando for possível aplicar a diferenciação, se 
 não for possível serão decifrados como letras minúsculas). Após cada caso de 
 teste deve ser impressa uma linha em branco, inclusive após o último.
 
*/

import java.io.IOException;
import java.util.Scanner;
 
public class URI 2502 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String line = readLine(leitor);
			int C = Integer.parseInt(line.split(" ")[0].trim());
			int N = Integer.parseInt(line.split(" ")[1].trim());
			String cript = readLine(leitor);
			String decript = readLine(leitor);
			char[][] cripto = new char[400][C+5000];
			String[] mensagens = new String[C+5000];
			
			for (int i = 0; i < N; i++) {
				mensagens[i] = readLine(leitor);
			}
			
			for (int i = 0; i < C; i++) {
				char c = cript.charAt(i);
				char d = decript.charAt(i);
				cripto[0][i] = c;
				cripto[1][i] = d;
				cripto[2][i] = Character.toLowerCase(c);
				cripto[3][i] = Character.toLowerCase(d);
			}
			
			for (int i = 0; i < N; i++) {
				String msg = "";
				for (char c : mensagens[i].toCharArray()) {
					for (int j = 0; j < C; j++) {
						if (c == cripto[0][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[1][j]) : cripto[1][j];
							break;
						} else if (c == cripto[1][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[0][j]) : cripto[0][j];
							break;
						}  else if (c == cripto[2][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[3][j]) : cripto[3][j];
							break;
						}  else if (c == cripto[3][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[2][j]) : cripto[2][j];
							break;
						} else if (j+1 == C) {
							msg += c;
						}
					}
				}
				System.out.println(msg);
			}
			System.out.print("\n");
		}
	}
	
	private static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.equals("")) {
			line = leitor.nextLine();
		}
		return line;
	}
	
	private static boolean a(char c) {
		return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == ' '
				|| c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
				|| c == '!' || c == '@' || c == '#' || c == '$' || c == '%'
				|| c == '|' || c == '&' || c == '*' || c == '(' || c == ')'
				|| c == '.' || c == ',' || c == ';' || c == ':' || c == '?';
	}
	
}