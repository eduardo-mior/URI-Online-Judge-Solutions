package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Leia um número no formato: XXXXX.YYY;
 2. Imprima o número na forma invertida: YYY.XXXXX.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma 
 linha. A linha tem um número real com 3 casas decimais. Conforme mostrado no 
 exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem 
 uma linha da forma descrita nos itens 2. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2762 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String STR = leitor.next();
		int A = Integer.valueOf(STR.split("\\.")[0]);
		int B = Integer.valueOf(STR.split("\\.")[1]);
		System.out.printf("%d.%d\n", B, A);
	}
	
}