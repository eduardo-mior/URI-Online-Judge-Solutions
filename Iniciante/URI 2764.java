package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Leia uma data no formato DD/MM/AA;
 2. Imprima a data no formato MM/DD/AA;
 3. Imprima a data no formato AA/MM/DD;
 4. Imprima a data no formato DD-MM-AA.
 
 ENTRADA
 A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem uma linha. 
 A linha tem o seguinte formato DD/MM/AA onde DD, MM, AA são números inteiros. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem três 
 linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2764 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String STR = leitor.next();
		String DD = STR.split("/")[0];
		String MM = STR.split("/")[1];
		String AA = STR.split("/")[2];
		System.out.printf("%s/%s/%s\n", MM, DD, AA);
		System.out.printf("%s/%s/%s\n", AA, MM, DD);
		System.out.printf("%s-%s-%s\n", DD, MM, AA);
	}
	
}