package Iniciante;

/*
 
 QUESTÃO
 Faça um programa que leia 5 valores inteiros. Conte quantos destes valores 
 digitados são pares e mostre esta informação.
 
 ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.
 
 SAÍDA
 Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores 
 pares lidos.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1065 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
        	x = leitor.nextInt();
        	if (x % 2 == 0 ) cont++;
        }
        System.out.println(cont + " valores pares");
    }
	
}