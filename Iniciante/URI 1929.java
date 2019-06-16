package Iniciante;

/*
 
 QUESTÃO
 Ana e suas amigas estão fazendo um trabalho de geometria para o colégio, em 
 que precisam formar vários triângulos, numa cartolina, com algumas varetas 
 de comprimentos diferentes. Logo elas perceberam que não dá para formar 
 triângulos com três varetas de comprimentos quaisquer: se uma das varetas 
 for muito grande em relação às outras duas, não dá para formar o triângulo.

 Neste problema, você precisa ajudar Ana e suas amigas a determinar se, dados 
 os comprimentos de quatro varetas, é ou não é possível selecionar três 
 varetas, dentre as quatro, e formar um triângulo.
 
 ENTRADA
 A entrada é composta por apenas uma linha contendo quatro números inteiros 
 A, B, C e D (1 <= A, B, C, D <= 100).

 SAÍDA
 Seu programa deve produzir apenas uma linha contendo apenas um caractere, que 
 deve ser ‘S’ caso seja possível formar o triângulo, ou ‘N’ caso não seja 
 possível formar o triângulo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1929 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int D = leitor.nextInt();
		int maior, segundoMaior, menor1, menor2;
		
		if (A > B && A > C && A > D) {
			maior = A;
			if (B > C && B > D) {
				segundoMaior = B;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = B;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = B;
				menor2 = C;
			}
		} else if (B > C && B > D) {
			maior = B;
			if (A > C && A > D ) {
				segundoMaior = A;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = C;
				menor2 = A;
			}
		} else if (C > D) {
			maior = C;
			if (A > B && A > D) {
				segundoMaior = A;
				menor1 = B;
				menor2 = D;
			} else if (B > D) {
				segundoMaior = B;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = A;
				menor2 = B;
			}
		} else {
			maior = D;
			if (A > B && A > C) {
				segundoMaior = A;
				menor1 = B;
				menor2 = C;
			} else if (B > C) {
				segundoMaior = B;
				menor1 = A;
				menor2 = C;
			} else {
				segundoMaior = C;
				menor1 = A;
				menor2 = B;
			}
		}
		
		if ((menor1 + menor2 > maior) || (menor1 + menor2 > segundoMaior) ||
			(menor1 + segundoMaior > maior) || (menor1 + segundoMaior > maior) ||
			(menor2 + segundoMaior > maior) || (menor2 + segundoMaior > maior))
			System.out.println("S");
		else
			System.out.println("N");
    }
    
}