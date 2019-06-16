package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Crie 3 variáveis para armazenar um único carácter;
 2. Leia um valor carácter para a primeira variável;
 3. Leia um valor carácter para a segunda variável;
 4. Leia um valor carácter para a terceira variável;
 5. Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na primeira variável lida no passo 2, uma virgula, um espaço 
    em branco, a letra B, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na segunda variável lida no passo 3, a letra C, um espaço em 
    branco, o sinal de igual, um espaço em branco, o carácter armazenado na terceira 
    variável lida no passo 4. Não esqueça de pular linha;
 6. Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na primeira variável lida no passo 3, uma virgula, um espaço 
    em branco, a letra B, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na segunda variável lida no passo 4, a letra C, um espaço em 
    branco, o sinal de igual, um espaço em branco, o carácter armazenado na terceira 
    variável lida no passo 2. Não esqueça de pular linha;
 7. Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na primeira variável lida no passo 4, uma virgula, um espaço 
    em branco, a letra B, um espaço em branco, o sinal de igual, um espaço em branco, 
    o carácter armazenado na segunda variável lida no passo 2, a letra C, um espaço em 
    branco, o sinal de igual, um espaço em branco, o carácter armazenado na terceira 
    variável lida no passo 3. Não esqueça de pular linha.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três 
 linhas. Na primeira linha tem uma variável A que armazena um valor carácter. Na 
 segunda linha tem uma variável B que armazena um valor carácter. Na terceira linha 
 tem uma variável C que armazena um valor carácter. Conforme mostrado no exemplo 
 de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três 
 linhas da forma descrita nos itens 5, 6 e 7. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2759 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		char A = leitor.next().charAt(0);
		char B = leitor.next().charAt(0);
		char C = leitor.next().charAt(0);
		System.out.printf("A = %c, B = %c, C = %c\n", A, B, C);
		System.out.printf("A = %c, B = %c, C = %c\n", B, C, A);
		System.out.printf("A = %c, B = %c, C = %c\n", C, A, B);
	}
	
}