package Iniciante;

/*
 
 QUESTÃO
 Você fica tão feliz no natal que tem vontade de gritar para todo mundo: 
 "Feliz natal!!". Pra colocar toda essa felicidade pra fora, você montou 
 um programa que, colocado um índice I de felicidade, seu grito de natal 
 é mais animado.
 
 ENTRADA
 A entrada é composta por um inteiro I (1 < I <= 104) que representa o 
 índice de felicidade.

 SÁIDA
 A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a 
 última letra a da frase. Uma quebra de linha é necessária após a impressão 
 da frase.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2483 {
 	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		String a = "a";
		for (int i = 1; i < N; i++) {
			a += "a";
		}
		System.out.printf("Feliz nat%sl!", a);
	}
	
}