package Iniciante;

/*
 
 QUESTÃO
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 http://prntscr.com/jy6dh2
 
 ENTRADA
 Não há nenhuma entrada neste problema.

 SAÍDA
 Imprima a sequencia conforme exemplo abaixo

*/

import java.io.IOException;

public class URI 1095 {
	
	public static void main(String[] args) throws IOException {
		int i=1, j=60;
		while (j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			j-=5;
			i+=3;
		}
	}
	
}