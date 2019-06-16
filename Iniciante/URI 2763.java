package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
 2. Imprima os quatro números, sendo um valor por linha.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma 
 linha. A linha tem o seguinte formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD 
 são números inteiros. Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem 
 quatro linhas com um número inteiro em cada uma delas, conforme foi entrado. 
 Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2763 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String STR = leitor.next();
		String A = STR.substring(0, 3);
		String B = STR.substring(4, 7);
		String C = STR.substring(8, 11);
		String D = STR.substring(12, 14);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
	
}