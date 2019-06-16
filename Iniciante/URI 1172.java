package Iniciante;

/*
 
 QUESTÃO
 Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os 
 valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
 
 ENTRADA
 A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

 SAÍDA
 Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor 
 e x é o valor armazenado naquela posição.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1172 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] X = new int[10];
        for (int i=0; i < X.length; i++) {
            X[i] = leitor.nextInt();
        }
        for (int i=0; i < X.length; i++) {
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
            System.out.println("X["+ i +"] = " + X[i]);
        }
    }
	
}