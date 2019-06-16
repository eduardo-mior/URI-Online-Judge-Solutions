package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Leia 10 nomes, sem espaço em branco;
 2. Imprima o terceiro nome da lista;
 3. Imprima o sétimo nome da lista;
 4. Imprima o nono nome da lista.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem dez 
 linhas. Em cada linha tem um nome de no máximo 30 caracteres e sem espaço em 
 branco. Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três 
 linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2770 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			int M = leitor.nextInt();
			for (int i = 0; i < M; i++) {
				int Xi = leitor.nextInt();
				int Yi = leitor.nextInt();
				if ((Xi <= X && Yi <= Y) || (Xi <= Y && Yi <= X) || (Yi <= X && Xi <= Y))
					System.out.println("Sim");
				else
					System.out.println("Nao");
			}
		}
	}
	
}