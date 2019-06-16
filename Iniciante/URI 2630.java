package Iniciante;

/*
 
 QUESTÃO
 Alguns algoritmos de processamento de imagem exigem um pré-processamento no 
 qual é necessário transformar uma imagem colorida em uma imagem em tons de 
 cinza. Esta conversão pode ser realizada de diversas maneiras, dependendo 
 do resultado que se pretende obter.

 Para preservar a percepção das cores básicas pelo olho humano, uma conversão 
 apropriada seria tomar 30% da componente vermelha (R), 59% da componente 
 verde (G) e 11% da componente azul (B). Em termos matemáticos,

						P = 0, 30R + 0, 59G + 0, 11B

 Outras abordagens possíveis seriam determinar o valor de P através da média 
 aritmética das três componentes ou atribuir a P os valores da maior ou da 
 menor entre as três componentes.

 Dadas as componentes RGB de um pixel da imagem colorida, determine o valor 
 do pixel P da imagem em tons de cinza correspondente, determinada a conversão 
 a ser utilizada. Despreze a parte decimal do resultado, caso exista.
  
 ENTRADA
 A entrada em T (1 <= T <= 100) casos de teste, onde o valor de T é dado na 
 primeira linha da entrada. Cada caso de teste é composto por duas linhas: a 
 primeira linha contém a conversão a ser utilizada: eye para a primeira 
 abordagem descrita, mean para a média aritmética, max para o valor da maior 
 componente e min para o valor da menor componente. A segunda linha contém os 
 valores R, G, B (0 <= R, G, B <= 255) do pixel da imagem colorida.
 
 SAÍDA
 Para cada caso de testes dever ser impressa a seguinte mensagem "Caso #t: P", 
 onde P é o nível de cinza do pixel da imagem em tons de cinza após a 
 conversão do pixel da imagem colorida. Esta mensagem deve ser seguida de uma 
 quebra de linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2630 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 1; i <= T; i++) {
			String option = leitor.next();
			int R = leitor.nextInt();
			int G = leitor.nextInt();
			int B = leitor.nextInt();
			int answer;
			
			if (option.equalsIgnoreCase("mean")) answer = getMean(R, G, B);
			else if (option.equalsIgnoreCase("eye")) answer = getEye(R, G, B);
			else if (option.equalsIgnoreCase("min")) answer = getMin(R, G, B);
			else if (option.equalsIgnoreCase("max")) answer = getMax(R, G, B);
			else answer = -1;
			
			System.out.println(String.format("Caso #%d: %d", i, answer));
		}
	}
	
	private static int getMean(int a, int b, int c) {
		return (a + b + c) / 3;
	}
	
	private static int getEye(int a, int b, int c) {
		return (int) ((a * 0.30) + (0.59 * b) + (0.11 * c));
	}
	
	private static int getMin(int a, int b, int c) {
		if (a < b && a < c) return a;
		if (b < c) return b;
		else return c;
	}

	private static int getMax(int a, int b, int c) {
		if (a > b && a > c) return a;
		if (b > c) return b;
		else return c;
	}
	
}