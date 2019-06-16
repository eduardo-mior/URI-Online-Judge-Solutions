package Iniciante;

/*
 
 QUESTÃO
 A empresa ABC resolveu conceder um aumento de salários a seus funcionários 
 de acordo com a tabela abaixo: http://prntscr.com/jwh30j
 
 Leia o salário do funcionário e calcule e mostre o novo salário, bem como o 
 valor de reajuste ganho e o índice reajustado, em percentual.

 ENTRADA
 A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

 SAÍDA
 Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o 
 percentual de reajuste ganho, conforme exemplo abaixo.
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI 1048 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double salario = leitor.nextDouble();
		double reajuste;
		double novoSalario;
		int percent;
		
		if (salario >= 0 && salario <= 400) {
			reajuste = salario * 0.15;
			novoSalario = salario + reajuste;
			percent = 15;
		} else if (salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
			percent = 12;
		} else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
			percent = 10;
		} else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
			percent = 7;
		} else {
			reajuste = salario * 0.04;
			novoSalario = salario + reajuste;
			percent = 4;
		}
		
		System.out.println("Novo salario: " + df.format(novoSalario));
		System.out.println("Reajuste ganho: " +df.format(reajuste));
		System.out.println("Em percentual: " + percent + " %");
	}
	
}