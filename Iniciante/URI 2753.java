package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

 1. Crie vinte e seis variáveis inteira;
 2. Atribua a primeira variável o valor 97;
 3. Atribua as outras demais variável o valor da primeira somado de uma unidade;
 4. Mostre na tela os valores numéricos da primeira variável, um espaço em braco, o carácter 'e', outro 
 	espaço em branco e o seu valor alfanumérico (caracteres);
 5. Repita o procedimento para todas as outras variáveis.
 
 ENTRADA
 Não há.
 
 SAÍDA
 O resultado de seu programa deve ser o mesmo do exemplo de saída.

*/

import java.io.IOException;

public class URI 2753 {
	
    public static void main(String[] args) throws IOException {
    	for (int i = 97; i < 97 + 26; i++) {
    		System.out.printf("%d e %c\n", i, i);
    	}
    }
	
}