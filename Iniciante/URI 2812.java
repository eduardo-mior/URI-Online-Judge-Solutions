package Iniciante;

/*
 
 QUESTÃO
 Armandinho tem um amigo o tanto quanto chato, chamado Laércio. Quando jogam o 
 jogo do mestre manda, um jogo onde alguém dá uma ordem e alguém a cumpre, e 
 em vez de dar ordens legais como subir em uma árvore, pular o muro, plantar 
 bananeira ou organizar manifestações para derrubar o governo (independente de 
 quem estiver no poder) ele sempre pede algo maçante. Em sua última partido, 
 Laércio exigiu que Armandinho ordenasse uma lista de números, de forma que 
 apenas os números ímpares aparecessem e o primeiro item seja o maior, o 
 segundo seja o menor, o terceiro o segundo maior, o quarto seja o segundo 
 menor e assim por diante. Como fazer isso a mão é muito chato, Armandinho 
 procurou sua ajuda.
 
 ENTRADA
 A entrada consiste de um inteiro N que representa o número de casos testes 
 ( 1<N<1000 ). Cada caso teste começa com um inteiro M, que representa o 
 tamanho da lista (0<M<100). Seguem M inteiros Mi (0<Mi < 1000) que 
 representam a lista de Laércio.
 
 SAÍDA
 Imprima a lista ordenada como Laércio requisitou, com um espaço entre os 
 valores, pulando uma linha a cada caso teste.

*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class URI 2812 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			int M = leitor.nextInt();
			ArrayList<Integer> Mi = new ArrayList<>();
			for (int j = 0; j < M; j++) {
				int temp = leitor.nextInt();
				if (temp % 2 == 1) {
					Mi.add(temp);
				}
			}
			Collections.sort(Mi);
			String str = "";
			if (Mi.size() % 2 != 0) {
				int cont = 0;
				for (int j = 0; cont != Mi.size(); j++) {
					if (j < Mi.size() / 2) {
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j) + " ");
						cont += 2;
					} else {
						str += (Mi.get(j));
						cont++;
					}
				}
			} else {
				for (int j = 0; j < Mi.size() / 2; j++) {
					if (j + 1 < Mi.size() / 2)
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j) + " ");
					else
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j));
				}
			}
			System.out.println(str.trim());
		}
	}
	
}