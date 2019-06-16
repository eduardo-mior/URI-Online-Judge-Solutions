package Iniciante;

/*

 QUESTÃO
 Leia um valor de ponto flutuante com duas casas decimais. Este valor 
 representa um valor monetário. A seguir, calcule o menor número de notas 
 e moedas possíveis no qual o valor pode ser decomposto. As notas 
 consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são 
 de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

 ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante N (0 <= N <= 1000000.00).

 SAÍDA
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor 
 inicial, conforme exemplo fornecido.

 Obs: Utilize ponto (.) para separar a parte decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1021 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double dinheiroTotal = leitor.nextDouble();
        int notas = (int) dinheiroTotal;
        int moedas = (int) ((dinheiroTotal - notas) * 100);
        int notas100 = notas / 100;
        notas -= notas100 * 100;
        int notas50 = notas / 50;
        notas -= notas50 * 50;
        int notas20 = notas / 20;
        notas -= notas20 * 20;
        int notas10 = notas / 10;
        notas -= notas10 * 10;
        int notas5 = notas / 5;
        notas -= notas5 * 5;
        int notas2 = notas / 2;
        notas -= notas2 * 2;
        int moedas1 = notas;
        notas -= moedas1 * 1;
        int moedas50 = moedas / 50;
        moedas -= moedas50 * 50;
        int moedas25 = moedas / 25;
        moedas -= moedas25 * 25;
        int moedas10 = moedas / 10;
        moedas -= moedas10 * 10;
        int moedas05 = moedas / 5;
        moedas -= moedas05 * 5;
        int moedas01 = moedas;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");
    }
	
}