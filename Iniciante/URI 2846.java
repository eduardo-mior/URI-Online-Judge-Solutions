package Iniciante;

/*
 
 QUESTÃO
 A sequência de Fibonacci é uma das sequências mais famosas do mundo. Os 
 termos de Fibonacci são sempre iguais à soma dos dois termos anteriores 
 a eles na sequência, e os dois primeiros termos são 1. Ou seja:
 1 , 1, 2, 3, 5, 8, 13, 21, 34 ...

 Porém, não estamos interessados em achar os termos da sequência de Fibonacci, 
 mas sim os termos da sequência de Fibonot!

 A sequência de Fibonot é composta pelos números que não pertencem à sequência 
 de Fibonacci. Mais especificamente, os números inteiros positivos não-nulos. 
 Em ordem crescente!

 Eis os primeiros termos de Fibonot:
 4, 6, 7, 9, 10, 11, 12, 14, 15 ...

 Sua tarefa é achar o K-ésimo número de Fibonot.
 
 ENTRADA
 A entrada consiste um único inteiro K (1 <= K <= 105) especificando o índice 
 do elemento da sequência de Fibonot desejado.
 
 SAÍDA
 Um único inteiro representando o K-ésimo termo da sequência de Fibonot.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2846 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int cont = 0, res = 0;
		int a = leitor.nextInt();
		for (int i = 4; cont != a; i++) {
			if (!isFib(i)) {
				cont++;
				res = i;
			}
		}
		System.out.println(res);
	}

	private static boolean square(long x){
		long s = (long) Math.sqrt(x);
		return s * s == x;
	}
	
	private static boolean isFib(long c) {
		return (square(5 * c * c + 4) || square(5 * c * c - 4)) ;
	}
	
}