package Iniciante;

/*
 
 QUESTÃO
 Escreva um algoritmo que leia 2 números e imprima o resultado da divisão 
 do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao 
 impossivel” para os valores em questão.
 
 ENTRADA
 A entrada contém um número inteiro N. Este N será a quantidade de pares de 
 valores inteiros (X e Y) que serão lidos em seguida.
 
 SAÍDA
 Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, 
 ou “divisao impossivel” caso não seja possível efetuar o cálculo.

 Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e 
 C++ gera outro inteiro. Utilize cast :)
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1116 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int X, Y;
		for (int i = 0; i < N; i++) {
			X = leitor.nextInt();
			Y = leitor.nextInt();
			if (Y == 0) System.out.println("divisao impossivel");
			else System.out.println((double) X / Y);
		}
    }
	
}