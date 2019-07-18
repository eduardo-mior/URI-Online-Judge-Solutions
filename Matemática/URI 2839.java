package Matemática;

/*
 
 QUESTÃO
 Por algum motivo desconhecido, Rangel só tem um par de meias de cada cor.

 Hoje ele está atrasado para ir a faculdade e ainda precisa pegar um par de 
 meias, mas as meias estão todas bagunçadas.

 Dado o número de pares de meias na gaveta de Rangel, ele quer saber quantas 
 meias ele precisa pegar, no mínimo, para ter pelo menos um par da mesma cor.
 
 ENTRADA
 Cada caso é composto de um único inteiro N (1 <= N <= 105) que corresponde a 
 quantidade de pares de meias na gaveta.
 
 SAÍDA
 Você deve imprimir uma linha com um único inteiro que corresponde a quantidade 
 mínima de meias que Rangel precisa pegar.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2839 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int meias = leitor.nextInt();
    	System.out.println(meias + 1);
    }
    
}