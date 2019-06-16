package Iniciante;

/*
 
 QUESTÃO
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 http://prntscr.com/jy6n0r
 
 ENTRADA
 Não há nenhuma entrada neste problema.

 SAÍDA
 Imprima a sequencia conforme exemplo abaixo

*/

import java.io.IOException;

public class URI 1097 {
	
	public static void main(String[] args) throws IOException {
		int i=1, j=7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j+=5;
			i+=2;
		}
	}
	
}