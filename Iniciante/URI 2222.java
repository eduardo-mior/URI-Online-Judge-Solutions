package Iniciante;

/*
 
 QUESTÃO
 Dabriel é um menino fissurado por matemática, ele acaba de aprender em sua 
 escola operações sobre conjuntos.
 Após passar a tarde toda brincando com alguns conjuntos que ele possui, 
 chega a hora de resolver as lições de casa, porém ele já está muito cansado 
 e com medo de que possa cometer alguns erros, solicitou sua ajuda.

 Dabriel deseja um programa de computador que dado N conjuntos e os elementos 
 de cada conjunto, ele possa realizar algumas operações, são elas:

 1 X Y: Retorna a quantidade de elementos distintos da intersecção entre o conjunto X com o Y.

 2 X Y: Retorna a quantidade de elementos distintos da união entre o conjunto X com o Y.
  
 ENTRADA
 A entrada é composta por diversas instâncias. A primeira linha da entrada 
 contém um inteiro T indicando o número de instâncias. Cada instância inicia 
 com um inteiro N (1 <= N <= 10⁴), representando a quantidade de conjuntos que 
 Dabriel possui. As próximas N linhas começam com um inteiro Mi (1 <= Mi <= 60), 
 que indica o total de elementos que o conjunto i possui, segue então Mi inteiros 
 Xij (1 <= Xij <= 60), que representam o valor de cada elemento. Na próxima linha 
 contém um inteiro Q (1 <= Q <= 10), representando quantas operações Dabriel deseja 
 realizar. Nas próximas Q linhas terá a descrição de uma operação.
 
 SAÍDA
 Para cada operação seu programa deverá imprimir a quantidade de elementos, 
 conforme explicado na descrição.
 
*/
 
import java.io.IOException;
import java.util.Scanner;

public class URI 2222 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 0; i < T; i++) {
			int N = leitor.nextInt();
			int M[][] = new int[N][];
			for (int j = 0; j < N; j++) {
				int Mi = leitor.nextInt();
				M[j] = new int[Mi];
				for (int k = 0; k < Mi; k++) {
					M[j][k] = leitor.nextInt();
				}
			}
			
			int Q = leitor.nextInt();
			for (int j = 0; j < Q; j++) {
				int O = leitor.nextInt();
				int C1 = leitor.nextInt() - 1;
				int C2 = leitor.nextInt() - 1;

				int c0[] = new int[61];
				for (int a = 0; a < 61; a++) {
					c0[a] = 0;
				}

				if (O == 1) {
					for (int a = 0; a < M[C1].length; a++) {
						for (int b = 0; b < M[C2].length; b++) {
							if (M[C1][a] == M[C2][b]) {
								c0[M[C1][a]] += 1;
								break;
							}
						}
					}          

					for (int a = 0; a < M[C2].length; a++) {
						for (int b = 0; b < M[C1].length; b++) {
							if (M[C2][a] == M[C1][b]) {
								c0[M[C2][a]] += 1;
								break;
							}
						}
					}
				} else if (O == 2) {
        
					for (int a = 0; a < M[C1].length; a++) {
						c0[M[C1][a]] += 1;
					}

					for (int a = 0; a < M[C2].length; a++) {
						c0[M[C2][a]] += 1;
					}
				}
			  
				int E = 0;

				for (int k = 0; k < c0.length; k++) {
					if (c0[k] > 0) {
						E += 1;
					}
				}
				
				System.out.println(E);
			}
		}
	}
	
}