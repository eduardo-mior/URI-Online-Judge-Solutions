package Iniciante;

/*
 
 QUESTÃO
 Faça um programa que leia um vetor A[100]. No final, mostre todas as 
 posições do vetor que armazenam um valor menor ou igual a 10 e o valor 
 armazenado em cada uma das posições.
 
 ENTRADA
 A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

 SAÍDA
 Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a 
 posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1174 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double[] A = new double[100];
        for (int i=0; i < A.length; i++) {
            A[i] = leitor.nextDouble();
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] <= 10) System.out.println(String.format("A["+ i +"] = %.1f" , A[i]));
        }
    }
	
}