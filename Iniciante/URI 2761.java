package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Crie uma variável inteira;
 2. Crie uma variável real de simples precisão;
 3. Crie uma variável que armazene um carácter;
 4. Crie uma variável que armazene uma frase de no máximo 50 caracteres;
 5. Leia todas as variáveis na ordem da forma criada;
 6. Imprima todas as variáveis como foram lidas;
 7. Imprima as variáveis, separando-as por uma tabulação (8 espaços), na ordem que foram lidas;
 8. Imprima as variáveis com exatos 10 espaços.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma linha. A linha 
 tem uma variável A que armazena um número inteiro, uma variável B que armazena um número real, 
 uma variável C com um carácter e uma variável D que armazena uma frase de no máximo 50 caracteres. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três linhas da 
 forma descrita nos itens 6, 7 e 8. Conforme mostra o exemplo de saída a seguir. Imprima os 
 valores de ponto flutuante com 6 casas decimais após a vírgula.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2761 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		float B = leitor.nextFloat();
		char C = leitor.next().charAt(0);
		String input = leitor.nextLine();
		String[] sd = input.split("");
		String D = "";
		for (int i = 1; i < sd.length; i++) D += sd[i];
		System.out.printf("%d%.6f%c%s\n", A, B, C, D);
		System.out.printf("%d\t%.6f\t%c\t%s\n", A, B, C, D);
		System.out.printf("%10d%10.6f%10c%10s\n", A, B, C, D);
	}
	
}