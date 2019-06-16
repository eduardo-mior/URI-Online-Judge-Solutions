package Iniciante;

/*
 
 QUESTÃO
 Dados três valores, verifique se os três podem formar um triângulo. Em caso 
 afirmativo, verifique se ele é escaleno, isóceles ou equilátero e se trata-se 
 de um triângulo retângulo ou não.
 
 ENTRADA
 A entrada consiste em três números inteiros A,B e C (0 < A,B,C < 10^5).


 SÁIDA
 A saída deve conter a string "Invalido" se os valores lidos não formarem um 
 triângulo. Se os valores formarem um triângulo a saída deve ser "Valido-Equilatero", 
 "Valido-Escaleno" ou "Valido-Isoceles" de acordo com a característica do triângulo 
 seguido de "Retangulo: S" se o triângulo for retângulo ou "Retangulo: N" se não 
 for, conforme os exemplos. 

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2313 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		if (!isValidTriangle(A, B, C)) {
			System.out.println("Invalido");
		} else {
			if (A == B && A == C && B == C) 
				System.out.println("Valido-Equilatero");
			else if (A == B || A == C || B == C)
				System.out.println("Valido-Isoceles");
			else 
				System.out.println("Valido-Escaleno");
		
			if (isRectangleTriangle(A, B, C)) 
				System.out.println("Retangulo: S");
			else 
				System.out.println("Retangulo: N");
		}
	}
	
	private static boolean isValidTriangle(int A, int B, int C) {
		double maior;
		double soma;
		boolean triangulo;
		
		if (A > B && A > C) maior = A;
		else if (B > C) maior = B;
		else maior = C;

		if (maior == A) soma = B + C;
		else if (maior == B) soma = A + C;
		else soma = B + A;
		
		if (soma > maior) triangulo = true;
		else triangulo = false;
		
		return triangulo;
	}
	
	private static boolean isRectangleTriangle(int A, int B, int C) {
		int aA = A * A;
		int bB = B * B;
		int cC = C * C;
		return aA + bB == cC || aA + cC == bB || cC + bB == aA;
	}
	
}