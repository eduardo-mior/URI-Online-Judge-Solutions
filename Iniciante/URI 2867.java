package Iniciante;

/*
 
 QUESTÃO
 Dados dois números inteiros, n e m, quantos dígitos tem nm ?

 Exemplos:

 2 e 10 - 210 = 1024 - 4 dígitos

 3 e 9 - 39 = 19683 - 5 dígitos
 
 ENTRADA
 A entrada é composta por vários casos de teste. A primeira linha tem um 
 número inteiro C, representando a quantidade de casos de teste. As C linhas 
 seguintes contém dois números inteiros N e M (1 <= N, M <= 100).
 
 SAÍDA
 Para cada caso de teste de entrada do seu programa, você deve imprimir um 
 número inteiro contendo a quantidade de dígitos do resultado da potência 
 calculada no respectivo caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2867 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        for (int i = 0; i < C; i++) {
        	int N = leitor.nextInt();
        	int M = leitor.nextInt();
        	int digitos = (int) (Math.log10(Math.pow(N, M)) + 1);
        	System.out.println(digitos);
        }
    }
	
}