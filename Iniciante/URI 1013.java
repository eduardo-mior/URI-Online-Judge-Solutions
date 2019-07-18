package Iniciante;

/*

 QUESTÃO
 Faça um programa que leia três valores e apresente o maior dos três 
 valores lidos seguido da mensagem “eh o maior”.

 ENTRADA
 O arquivo de entrada contém três valores inteiros.

 SAÍDA
 Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1013 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        int valor3 = leitor.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
	
}