package Iniciante;

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