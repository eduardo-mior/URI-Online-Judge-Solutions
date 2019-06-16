package Iniciante;

/*
 
 QUESTÃO
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a 
 seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve 
 apresentar a soma de todos os ímpares existentes entre X e Y.
 
 ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos 
 de teste que vem a seguir. Cada caso de teste consiste em uma linha 
 contendo dois inteiros X e Y.
 
 SAÍDA
 Imprima a soma de todos valores ímpares entre X e Y.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1099 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int X, Y, soma;
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		soma = 0;
    		X = leitor.nextInt();
    		Y = leitor.nextInt();
    		
    		if (Y > X) {
	    		for (int j = X+1; j < Y; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		} else {
	    		for (int j = Y+1; j < X; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		}
    		
    		System.out.println(soma);
    	}
    }
	
}