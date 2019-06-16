package Iniciante;

/*

 QUESTÃO
 Escreva um programa que leia um valor inteiro N. Este N é a quantidade de 
 linhas de saída que serão apresentadas na execução do programa.

 ENTRADA
 O arquivo de entrada contém um número inteiro positivo N.

 SAÍDA
 Imprima a saída conforme o exemplo fornecido. http://prntscr.com/jyfm34

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1143 {

    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
		}
    }
	
}