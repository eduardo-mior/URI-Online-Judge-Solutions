package Iniciante;

/*
 
 QUESTÃO
 Dado a posição inicial de um cavalo em um tabuleiro de xadrez e a posição 
 destino, deve se dizer se, com exatamente um único movimento, o cavalo 
 consegue alcançar a posição destino. Se isso for possível, o movimento é 
 classificado como válido, caso contrário, o movimento é dito inválido.

 Em um tabuleiro de xadrez se utiliza números, de 1 a 8, para especificar 
 a linha do tabuleiro e letras, de 'a' a 'h' para especificar a coluna.
 
 ENTRADA
 A entrada é composta por uma única linha contendo a posição inicial do 
 cavalo  e a posição destino, separadas por um espaço em branco. Uma posição 
 no  tabuleiro é especificada por um caractere, que representa a coluna, 
 seguido  de um número inteiro que representa a linha.
 
 SAÍDA
 A saída consiste em uma linha contendo a mensagem "VALIDO" caso o movimento 
 seja um movimento válido de um cavalo no jogo de xadrez ou "INVALIDO" 
 caso contrário.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2808 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String inicial = leitor.next();
		String destino = leitor.next();
		int a1 = inicial.charAt(1);
		int a2 = Pos.get(inicial.charAt(0)).pos;
		int b1 = destino.charAt(1); 
		int b2 = Pos.get(destino.charAt(0)).pos;
		if (valid(a1, a2, b1, b2))
			System.out.println("VALIDO");
		else 
			System.out.println("INVALIDO");
	}
	
	private static boolean valid(int a1, int a2, int b1, int b2) {
		if (a1 + 2 == b1 && a2 + 1 == b2) return true;
		if (a1 + 1 == b1 && a2 + 2 == b2) return true;
		if (a1 + 2 == b1 && a2 - 1 == b2) return true;
		if (a1 + 1 == b1 && a2 - 2 == b2) return true;
		if (a1 - 2 == b1 && a2 - 1 == b2) return true;
		if (a1 - 1 == b1 && a2 - 2 == b2) return true;
		if (a1 - 2 == b1 && a2 + 1 == b2) return true;
		if (a1 - 1 == b1 && a2 + 2 == b2) return true;
		return false;
	}

	enum Pos {
		a(1), b(2), c(3), d(4), e(5), f(6), g(7), h(8);

		int pos;
		
		Pos(int pos) {this.pos = pos;}
		
		private static Pos get(char c) {return Pos.valueOf(String.valueOf(c));}
	}
	
}