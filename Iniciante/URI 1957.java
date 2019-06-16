package Iniciante;

/*
 
 QUESTÃO
 Os dados armazenados no computador estão em binário. Uma forma econômica 
 de ver estes números é usar a base 16 (hexadecimal).

 Sua tarefa consiste em escrever um programa que, dado um número natural 
 na base 10, mostre sua representação em hexadecimal.
 
 ENTRADA
 A entrada é um número inteiro positivo V na base 10 (1 <= V <= 2 x 10^9).

 SAÍDA
 A saída é o mesmo número V na base 16 em uma única linha (não esqueça do 
 caractere de fim-de-linha). Use letras maiúsculas, conforme os exemplos.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1957 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int decimal = leitor.nextInt();
		String hexadecimal = Integer.toHexString(decimal).toUpperCase();
		System.out.println(hexadecimal);
    }
	
}