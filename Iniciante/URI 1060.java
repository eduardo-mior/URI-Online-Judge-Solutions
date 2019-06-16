package Iniciante;

/*
 
 QUESTÃO
 Faça um programa que leia 6 valores. Estes valores serão somente negativos 
 ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade 
 de valores positivos digitados.
 
 ENTRADA
 Seis valores, negativos e/ou positivos.

 SAÍDA
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1060 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        for (int i=0; i < 6; i++) {
        	double n = leitor.nextDouble();
        	if (n > 0) cont++;
        }
        System.out.println(cont + " valores positivos");
    }
	
}