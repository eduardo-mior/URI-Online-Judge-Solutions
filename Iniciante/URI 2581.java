package Iniciante;

/*
 
 QUESTÃO
 Toorg é o integrante mais sábio do grupo de heróis denominado Os Protetores 
 da Via Láctea. Para qualquer pergunta, ele tem a resposta ideal! Escreva 
 um programa que, dada uma pergunta, informe a resposta de Toorg.
  
 ENTRADA
 A entrada terá diversos casos de teste. A cada caso de teste, um número N é 
 apresentado, que representa o número de casos de teste. Em seguida, haverá 
 N linhas, com as perguntas feitas para Toorg.
 
 SAÍDA
 Para cada caso de teste, imprima a resposta de Toorg.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2581 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String question = leitor.nextLine();
			System.out.println("I am Toorg!");
		}
	}
	
}