package Iniciante;

/*

 QUESTÃO
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e 
 o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que 
 este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
 o total a receber no final do mês, com duas casas decimais.

 ENTRADA
 O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 
 valores de dupla precisão (double) com duas casas decimais, representando 
 o salário fixo do vendedor e montante total das vendas efetuadas por este 
 vendedor, respectivamente.

 SAÍDA
 Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1009 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
	
}