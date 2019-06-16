package Iniciante;

/*
 
 QUESTÃO
 Todos os seus amigos estão loucos pelo filme "Interstellar". Agora eles 
 estão postando textos no Facebook em Código Morse. Você precisa escrever 
 um código para decodificar Morse!

 Este Código Morse contém somente letras minúsculas (a-z) e espaços em branco.

 Nota - Código Morse é uma forma de codificar caracteres em uma sequências 
 de pontos e traços. Cada caracter tem uma codificação fixa. Um exemplo bem 
 famoso é o Morse de SOS "...---..." . S é codificado como "..." (ponto ponto 
 ponto) e O é codificado como "---" (traço traço traço).
 Neste problema, um ponto é denotado por "=" e um traço por "===". Símbolos 
 são separados por "." , letras são separadas por "..." e palavras são separadas por "......." . 
 Sendo assim, SOS é codificado como =.=.=...===.===.===...=.=.=
 Codificações para todos os caracteres podem ser encontradas no link abaixo.
      http://morsecode.scphillips.com/morse2.html
 
 ENTRADA
 A entrada consiste em múltiplos casos de teste.

 A primeira linha de cada entrada contém o número de casos de teste (t)(1 <= t <= 10).

 As próximas t linhas contém os Códigos Morse. O tamanho de cada código é menor 
 que 1000 caracteres.

 SÁIDA
 A saída é divida em linhas, que representam a mensagem decodificada de cada caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2338 {
 	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String morse = leitor.next();
			System.out.println(translateMessage(morse));
		}
	}
	
	private static String translateMessage(String morse) {
		String[] characters = morse.split("\\.{3}");
		String transaltedMessage = "";
		for (int i = 0; i < characters.length; i++) {
			transaltedMessage += convertedChar(characters[i].startsWith(".") ? characters[i].substring(1, characters[i].length()) : characters[i]);
		}
		return transaltedMessage;
	}

	private static char convertedChar(String str) {
		switch (str) {
			case "=.===":         return 'a';
			case "===.=.=.=":     return 'b';
			case "===.=.===.=":   return 'c';
			case "===.=.=":       return 'd';
			case "=":             return 'e';
			case "=.=.===.=":	  return 'f';
			case "===.===.=":     return 'g';
			case "=.=.=.=":		  return 'h';
			case "=.=":			  return 'i';
			case "=.===.===.===": return 'j';
			case "===.=.===":	  return 'k';
			case "=.===.=.=":	  return 'l';
			case "===.===": 	  return 'm';
			case "===.=":		  return 'n';
			case "===.===.===":	  return 'o';
			case "=.===.===.=":	  return 'p';
			case "===.===.=.===": return 'q';
			case "=.===.=":		  return 'r';
			case "=.=.=":		  return 's';
			case "===":			  return 't';
			case "=.=.===":		  return 'u';
			case "=.=.=.===":	  return 'v';
			case "=.===.===":	  return 'w';
			case "===.=.=.===":   return 'x';
			case "===.=.===.===": return 'y';
			case "===.===.=.=":   return 'z';
			default: return ' ';
		}
	}
	
}