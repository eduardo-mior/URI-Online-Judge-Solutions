package Iniciante;

/*
 
 QUESTÃO
 Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 
 ENTRADA
 A entrada contém um valor inteiro N (2 < N < 1000).

 SAÍDA
 Imprima a tabuada de N, conforme o exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1078 {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 1; i <= 10; i++) {
    		System.out.println(i + " x " + N + " = " + (N * i));
    	}
	}
	
}