package Iniciante;

/*
 
 QUESTÃO
 A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como 
 série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, 
 é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro 
 N (N < 46) e mostre os N primeiros números dessa série.
 
 ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 46).

 SAÍDA
 Os valores devem ser mostrados na mesma linha, separados por um espaço 
 em branco. Não deve haver espaço após o último valor.
     
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1151 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println(anterior);
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        }
    }
	
}