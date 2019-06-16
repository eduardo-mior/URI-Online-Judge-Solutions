package Iniciante;

/*
 
 QUESTÃO
 Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. 
 Feito de um minério místico especial chamado Uru e forjado no coração de uma 
 estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lendários ferreiros.

 Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.

 Escreva um programa que, dado um nome, e a força, em Newtons, aplicado ao tentar 
 levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.
 
 ENTRADA
 
 SAÍDA
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1865 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;
		for (int i = 0; i < C; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equalsIgnoreCase("thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
	
}