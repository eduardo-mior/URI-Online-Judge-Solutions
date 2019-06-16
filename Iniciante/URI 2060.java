package Iniciante;

/*
 
 QUESTÃO
 Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios 
 matemáticos para Cino resolver. Desta vez, Bino gerou uma lista de 
 números e perguntou ao Cino quantos números da lista são múltiplos 
 de 2, 3, 4 e 5.

 Esse desafio pode parecer simples, porém, quando a lista contém muitos 
 números, Cino se confunde e acaba errando alguns cálculos. Para ajudar 
 Cino, faça um programa para resolver o desafio de Bino.
 
 ENTRADA
 A primeira linha da entrada consiste em um inteiro N (1 <= N <=1000), 
 representando a quantidade de números na lista de Bino.

 A segunda linha contém N inteiros Li (1 <= Li <= 100), representando os 
 números da lista de Bino.
 
 SAÍDA
 Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na 
 lista. Observe a formatação da saída nos exemplos, pois ela deve ser 
 seguida rigorosamente.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2060 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int L, m2 = 0, m3 = 0, m4 = 0, m5 = 0;
    	for (int i = 0; i < N; i++) {
    		L = leitor.nextInt();
    		if (L % 2 == 0) m2++;
    		if (L % 3 == 0) m3++;
    		if (L % 4 == 0) m4++;
    		if (L % 5 == 0) m5++;
    	}
    	System.out.println(m2 + " Multiplo(s) de 2");
    	System.out.println(m3 + " Multiplo(s) de 3");
    	System.out.println(m4 + " Multiplo(s) de 4");
    	System.out.println(m5 + " Multiplo(s) de 5");
    }
	
}