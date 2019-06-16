package Iniciante;

/*
 
 QUESTÃO
 Escreva um programa que leia 2 valores X e Y e que imprima todos os valores 
 entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.
 
 ENTRADA
 O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não 
 necessariamente em ordem crescente.

 SAÍDA
 Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1133 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int X = leitor.nextInt();
		int Y = leitor.nextInt();
		if (X > Y) {
			for (int i = Y+1; i < X; i++) {
				if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
			}
		} else {
			for (int i = X+1; i < Y; i++) {
				if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
			}
		}
    }
	
}