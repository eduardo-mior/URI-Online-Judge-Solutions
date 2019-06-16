package Iniciante;

/*
 
 QUESTÃO
 As sequências de Iccanobif são sequências onde cada termo é sempre igual a 
 soma dos dois próximos subsequentes a eles. Exceto pelos dois últimos termos 
 os quais são sempre iguais a 1.

 Exemplo de uma sequência de Iccanobif com 10 termos: 55, 34, 21, 13, 8, 5, 3, 2, 1, 1.

 Sua tarefa é, dado um valor inteiro, imprimir a sequência de Iccanobif de 
 tamanho correspondente.
 
 ENTRADA
 A entrada consiste de um único inteiro N (1 <= N <= 40) representando o 
 tamanho da sequência de Iccanobif desejada.
 
 SAÍDA
 A saída consiste de um única linha contendo os termos da sequência de 
 Iccanobif de tamanho N separados por um único espaço em branco.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2807 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int ant = 1;
		int prox = 1;
		int atual = 0;
		int[] numbers = new int[N+10];
		numbers[0] = 1;
		numbers[1] = 1;
		for (int i = 2; i < N; i++) {
			atual = ant + prox;
			ant = prox;
			prox = atual;
			numbers[i] = atual;
		}
		sort(numbers, 0, numbers.length -1);
		for (int i = 0; i < N; i++) {
			if (i < N-1) System.out.print(numbers[i] + " ");
			else System.out.println(numbers[i]);
		}
	}

	private static void sort(int[] v, int inicio, int fim) {
		int aux, down, up, pivo, i;
		pivo = v[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			while (v[down] >= pivo && down < fim)
				down++;
			while (v[up] < pivo && up > inicio)
				up--;
			if (down < up) {
				aux = v[down];
				v[down] = v[up];
				v[up] = aux;
			}
		}
		
		v[inicio] = v[up];
		v[up] = pivo;

		if (inicio < up && inicio != up - 1)
			sort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			sort(v, up + 1, fim);
	}
	
}