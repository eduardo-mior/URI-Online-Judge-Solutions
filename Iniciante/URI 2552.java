package Iniciante;

/*
 
 QUESTÃO
 Está chegando a grande final do Campeonato Nlogonense de Surf Aquático, que 
 este ano ocorrerá na cidade de Bonita Horeleninha (BH)! Nesta cidade, o jogo 
 PãodeQueijoSweeper é bastante popular!

 O tabuleiro do jogo consiste em uma matriz de N linhas e M colunas. Cada 
 célula da matriz contém um pão de queijo ou o número de pães de queijo que 
 existem nas celulas adjacentes a ela. Uma célula é adjacente a outra se 
 estiver imediatamente à esquerda, à direita, acima ou abaixo da célula. Note 
 que, se não contiver um pão de queijo, uma célula deve obrigatoriamente 
 conter um número entre 0 e 4, inclusive.

 Dadas as posições dos pães de queijo, determine o tabuleiro do jogo!
  
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 os inteiros N e M (1 <= N, M <= 100). As próximas N linhas contém M inteiros 
 cada, separados por espaços, descrevendo os pães de queijo no tabuleiro. O 
 j-ésimo inteiro da i-ésima linha é 1 se existe um pão de queijo na linha i e 
 coluna j do tabuleiro, ou 0 caso contrário.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima N linhas com M inteiros cada, não separados 
 por espaços, descrevendo a configuração do tabuleiro. Se uma posição contém um 
 pão de queijo, imprima 9 para ela; caso contrário, imprima o número cuja posição 
 deve conter.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2552 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();
			int[][] mat = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					mat[i][j] = leitor.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (mat[i][j] == 1) System.out.print("9");
					else System.out.print(a(mat, i, j));
				}
				System.out.print("\n");
			}
		}
	}
	
	private static int a(int[][] mat, int i, int j) {
		int p = 0;
		int l = mat.length -1;
		int c = mat[i].length - 1;
		if (i > 0 && mat[i - 1][j] == 1) p++;
		if (i < l && mat[i + 1][j] == 1) p++;
		if (j > 0 && mat[i][j - 1] == 1) p++;
		if (j < c && mat[i][j + 1] == 1) p++;
		return p;
	}
	
}