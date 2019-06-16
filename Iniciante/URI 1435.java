package Iniciante;

/*
 
 QUESTÃO
 Escreva um algoritmo que leia um inteiro N (0 <= N <= 100), correspondente 
 a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o 
 exemplo abaixo. http://prntscr.com/k0zax4
 
 ENTRADA
 A entrada consiste de vários inteiros, um valor por linha, correspondentes 
 as ordens das matrizes a serem construídas. O final da entrada é marcado por 
 um valor de ordem igual a zero (0).
 
 SAÍDA
 Para cada inteiro da entrada imprima a matriz correspondente, de acordo com 
 o exemplo. Os valores das matrizes devem ser formatados em um campo de 
 tamanho 3 justificados à direita e separados por espaço. Após o último 
 caractere de cada linha da matriz não deve haver espaços em branco. Após a 
 impressão de cada matriz deve ser deixada uma linha em branco.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1435 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int x;
    	while (N != 0) {
    		for (int i = 1; i <= N; i++) {
    			for (int j = 1 ; j <= N; j++) {
    				x = i;
                    if (j < x) x = j;
                    if (N-i+1 < x) x = N-i+1;
                    if (N-j+1 < x) x = N-j+1;
                    
                    System.out.printf("%3d", x);
                    if (j < N) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            System.out.print("\n");
            N = leitor.nextInt();
        }
    }
	
}