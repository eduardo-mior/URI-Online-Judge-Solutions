package Iniciante;

/*
 
 QUESTÃO
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
 mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
 valores lidos são múltiplos entre si.
 
 ENTRADA
 A entrada contém valores inteiros.

 SAÍDA
 A saída deve conter uma das mensagens conforme descrito acima.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1044 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		if (A % B == 0 || B % A == 0) System.out.println("Sao Multiplos");
		else System.out.println("Nao sao Multiplos");
	}
	
}