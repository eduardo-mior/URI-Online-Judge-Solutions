package Iniciante;

/*
 
 QUESTÃO
 Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de 
 todos gostarem de suas esfirras, ele só sabe dar o troco com duas notas, 
 ou seja, nem sempre é possível receber o troco certo. Para facilitar a 
 vida de Gil, escreva um programa para ele que determine se é possível ou 
 não devolver o troco exato utilizando duas notas.

 As notas disponíveis são: 2, 5, 10, 20, 50 e 100.
 
 ENTRADA
 A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, 
 em seguida, o valor inteiro M pago pelo cliente (N < M <= 104). A entrada 
 termina com N = M = 0.
 
 SAÍDA
 Seu programa deverá imprimir "possible" se for possível devolver o troco 
 exato ou "impossible" se não for possível.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2140 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (true) {
        	int N = leitor.nextInt();
        	int M = leitor.nextInt();
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possivel = true;
    			}
    		}
    		
    		if (possivel) System.out.println("possible");
    		else System.out.println("impossible");
    	}
    }
	
}