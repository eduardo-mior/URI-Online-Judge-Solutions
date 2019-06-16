package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Crie 3 variáveis para armazenar uma frase de no máximo 100 caracteres;
 2. Leia uma frase para a primeira variável;
 3. Leia uma frase para a segunda variável;
 4. Leia uma frase para a terceira variável;
 5. Imprima a primeira variável lida no passo 2, a segunda variável lida no passo 3, 
    a terceira variável lida no passo 4. Não esqueça de pular linha;
 6. Imprima a primeira variável lida no passo 3, a segunda variável lida no passo 4, 
    a terceira variável lida no passo 2. Não esqueça de pular linha;
 7. Imprima a primeira variável lida no passo 4, a segunda variável lida no passo 2, 
    a terceira variável lida no passo 3. Não esqueça de pular linha;
 8. Repita o procedimento 5, imprimindo só 10 caracteres de cada variável.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. 
 Na primeira linha tem uma variável A que armazena uma frase de no máximo 40 caracteres. 
 Na segunda linha tem uma variável B que armazena uma frase de no máximo 40 caracteres. 
 Na terceira linha tem uma variável C que armazena uma frase de no máximo 40 caracteres. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro 
 linhas da forma descrita nos itens 5, 6, 7 e 8. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2760 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String A = leitor.nextLine();
		String B = leitor.nextLine();
		String C = leitor.nextLine();
		System.out.printf("%s%s%s\n", A, B, C);
		System.out.printf("%s%s%s\n", B, C, A);
		System.out.printf("%s%s%s\n", C, A, B);
		System.out.printf("%.10s%.10s%.10s\n", A, B, C);
	}
	
}