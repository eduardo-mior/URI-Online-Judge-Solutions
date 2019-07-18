package Iniciante;

/*
 
 QUESTÃO
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação 
 de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
 correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
 numero negativo.
 
 ENTRADA
 Leia três valores de ponto flutuante (double) A, B e C.

 SAÍDA
 Se não houver possibilidade de calcular as raízes, apresente a mensagem 
 "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 
 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
 Imprima sempre o final de linha após cada mensagem.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1036 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        
        if ((A == 0) | (B * B - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
			return;
		}
        
        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
	
}