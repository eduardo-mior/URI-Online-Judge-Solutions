package Iniciante;

/*
 
 QUESTÃO
 Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. 
 A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor 
 e a sua posição dentro do vetor, mostrando esta informação.
 
 ENTRADA
 A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando 
 o número de elementos que deverão ser lidos em seguida para o vetor X[N] de 
 inteiros. A segunda linha contém cada um dos N valores, separados por um espaço.
 
 SAÍDA
 A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do 
 menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:” 
 seguido de um espaço e da posição do vetor na qual se encontra o menor valor 
 lido, lembrando que o vetor inicia na posição zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1180 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] X = new int[N];
        int menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
        	X[i] = leitor.nextInt();
        	if (i == 0) {
        		menor = X[i];
        		posMenor = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i;
        	}
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posMenor);
    }
	
}