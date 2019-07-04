package Strings;

/*

 QUESTÃO
 TopCoder decidiu automatizar o processo de atribuição de níveis de dificuldade 
 para os problemas. Os desenvolvedores do TopCoder concluíram que a dificuldade 
 do problema esta relacionado apenas ao comprimento médio das palavras do 
 enunciado do problema. Se o comprimento médio das palavras do enunciado é menor 
 ou igual a 3, o problema recebe dificuldade de 250 pontos. Se o comprimento 
 médio das palavras do enunciado for 4 ou 5, o problema recebe dificuldade de 
 500 pontos. Se o comprimento médio das palavras do enunciado for maior ou igual 
 a 6, o problema recebe dificuldade de 1000 pontos.

 Definições:
 
 Símbolo: um conjunto de carateres ligados em ambos os lados por espaços, ou 
 pelo início da descrição do problema, ou ainda pelo fim da descrição do problema.
 
 Palavra: um símbolo que contenha apenas letras a-z ou A-Z, e pode terminar com um único ponto.

 Comprimento da palavra: número de letras de uma palavra (um ponto não é uma letra).

 Exemplos de símbolos que são palavras (aspas duplas apenas para exemplificar): "AB", "ab".

 Exemplo de símbolos que não são palavras: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".

 O comprimento médio das palavras é dado pela soma dos tamanhos das palavras do enunciado 
 dividido pelo numero de palavras, a divisão é feita por números inteiros. Se o número de 
 palavras for zero, então o comprimento médio das palavras é zero.

 Sua tarefa é dado o enunciado do problema, computar a sua classificação de dificuldade do 
 problema, que poderá ser 250, 500, ou 1000.
 
 ENTRADA
 A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que 
 contém o enunciado de um problema, é uma string que contém entre 1 e 50 caracteres ('A'-'Z', 
 'a'-'z', '0'-'9', ' ', '.'), inclusive. O final da entrada é determinado por EOF.
 
 SAÍDA
 Compute o comprimento médio das palavras do enunciado do problema, e mostre a classificação 
 do problema, para mais detalhes olhe o exemplo abaixo.
 
*/

import java.util.Scanner;

public class URI 1243 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String linha = readLine(leitor);
			String[] palavras = linha.split(" ");
			int countPalavras   = 0;
			int tamanhoPalavras = 0;
			for (String palavra : palavras) {
				boolean palavraValida = true;
				for (int i = 0; i < palavra.length(); i++) {
					char c = palavra.charAt(i);
					if (!Character.isAlphabetic(c) && !(c == '.' && i + 1 == palavra.length())) {
						palavraValida = false;
						break;
					}
				}
				if (palavraValida) {
					countPalavras++;
					tamanhoPalavras += palavra.replace(".", "").length();
				}
			}
			if (countPalavras == 0 || tamanhoPalavras == 0)  {
				System.out.println(250);
			} else {
				int media = tamanhoPalavras / countPalavras;
				if      (media <= 3) System.out.println(250 );
				else if (media <= 5) System.out.println(500 );
				else                 System.out.println(1000);
			}
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}