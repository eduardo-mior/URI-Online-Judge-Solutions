package Iniciante;

/*
 
 QUESTÃO
 Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos 
 números impares entre eles.

 ENTRADA
 O arquivo de entrada contém dois valores inteiros.

 SAÍDA
 O programa deve imprimir um valor inteiro. Este valor é a soma dos 
 valores ímpares que estão entre os valores fornecidos na entrada que 
 deverá caber em um inteiro.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1071 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int soma = 0;
		int X = leitor.nextInt();
		int Y = leitor.nextInt();

		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
    }
	
}