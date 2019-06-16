package Iniciante;

/*
 
 QUESTÃO
 Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram 
 pares, quantos valores digitados foram ímpares, quantos valores digitados 
 foram positivos e quantos valores digitados foram negativos.
 
 ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

 SAÍDA
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, 
 não esquecendo o final de linha após cada uma.
 	
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1066 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int x;
        for (int i = 0; i < 5; i++) {
        	x = leitor.nextInt();
        	if (x % 2 == 0) contPar++;
        	else contImpar++;
        	if (x > 0) contPositivos++;
        	else if(x < 0) contNegativos++;
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");
    }
	
}