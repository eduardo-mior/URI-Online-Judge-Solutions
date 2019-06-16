package Iniciante;

/*
 
 QUESTÃO
 Com base na tabela abaixo, escreva um programa que leia o código de um item 
 e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 Tabela: http://prntscr.com/jwbkg8
 
 ENTRADA
 O arquivo de entrada contém dois valores inteiros correspondentes ao código e à 
 quantidade de um item conforme tabela acima.
 
 SAÍDA
 O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser 
 pago, com 2 casas após o ponto decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1038 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int codigo = leitor.nextInt();
		int quantia = leitor.nextInt();
		double total;
		switch (codigo) {
			case 1:	total = quantia * 4.00; break;
			case 2: total = quantia * 4.50; break;
			case 3: total = quantia * 5.00; break;
			case 4: total = quantia * 2.00; break;
			case 5: total = quantia * 1.50; break;
			default: total = 0;
		}
		System.out.println(String.format("Total: R$ %.2f", total));
	}
	
}