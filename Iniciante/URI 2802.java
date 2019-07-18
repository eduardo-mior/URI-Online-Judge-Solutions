package Iniciante;

/*
 
 QUESTÃO
 Dado um conjunto de N pontos sobre uma circunferência de um círculo, todo 
 par de pontos está ligado por um segmento e três desses segmentos nunca se 
 encontram em um ponto interno à circunferência.
 
 Sua tarefa é determinar em quantas partes esses segmentos dividem o interior 
 do círculo.
 
 ENTRADA
 A primeira e única linha da entrada contém um inteiro N (1 <= N <= 1000) 
 representando a quantidade de pontos sobre a circunferência.
 
 SAÍDA
 A saída consiste de uma única linha contendo um inteiro representando a 
 quantidade de partes do círculo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2802 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        double resposta = (Math.pow(N, 4.0) - (6.0 * Math.pow(N, 3.0)) + (23.0 * Math.pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
        System.out.println(String.format("%.0f", resposta));
    }
	
}