package Iniciante;

/*
 
 QUESTÃO
 Pedrinho é um garoto que adora festas em família, principalmente o Natal, 
 quando ganha presente dos pais e dos avós. Esse ano, seu pai lhe prometeu 
 um PS4, mas somente se Pedrinho conseguir resolver alguns desafios ao 
 longo do ano, sendo um deles, escrever um programa que calcule quantos 
 dias faltam para o Natal.

 Entretanto, Pedrinho tem somente 9 anos e não tem noção alguma de 
 programação, mas sabe que você, primo dele, mexe com "coisas de computador", 
 e dessa forma, pediu para você escrever o programa para ele. Não somente 
 isso, mas prometeu que deixaria você jogar todo final de semana e por quanto 
 tempo quiser!
 
 ENTRADA
 A entrada é composta por vários casos de teste. Cada linha contém o mês e 
 o dia do ano de 2016 (ano bissexto). A entrada termina com fim de arquivo.
 
 SAÍDA
 Se for Natal, imprima "E natal!"; se faltar somente um dia, imprima "E 
 vespera de natal!"; se já passou, imprima "Ja passou!". Caso contrário, 
 imprima "Faltam X dias para o natal!", sendo X o número de dias que faltam 
 para o Natal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2139 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int mes, dia, faltando;
    	String[] data;
    	while (leitor.hasNext()) {
    		data = leitor.nextLine().split(" ");
    		mes = Integer.parseInt(data[0]);
    		dia = Integer.parseInt(data[1]);
    		faltando = ((12 - mes) * 30) + (30 - dia);
    		
    		if (mes == 2) faltando -= 1;
    		if (mes == 4) faltando -= 1;
    		if (mes == 5) faltando -= 1;
    		if (mes == 8) faltando += 1;
    		if (mes == 11) faltando -=1;
    		if (mes > 5) faltando -= 2;
    		if (mes > 7) faltando -= 2;
    		if (mes > 11) faltando -= 1;
    		
    		if (faltando == 1) System.out.println("E vespera de natal!");
    		else if (faltando == 0) System.out.println("E natal!");
    		else if (faltando < 0) System.out.println("Ja passou!");
    		else System.out.println("Faltam " + faltando + " dias para o natal!");
    	}
    }
	
}