package Iniciante;

/*
 
 QUESTÃO
 Analógimôn Go! é um jogo bastante popular. Em sua jornada, o jogador percorre 
 diversas cidades capturando pequenos monstrinhos virtuais, chamados analógimôns. 
 Você acabou de chegar em uma cidade que contém o último analógimôn que falta 
 para sua coleção!

 A cidade pode ser descrita como um grid de N linhas e M colunas. Você está em 
 uma dada posição da cidade, enquanto o último analógimôn está em outra posição 
 da mesma cidade. A cada segundo, você pode se mover (exatamente) uma posição ao 
 norte, ao sul, a leste ou a oeste. Considerando que o analógimôn não se move, 
 sua tarefa é determinar o menor tempo necessário para ir até a posição do monstrinho.

 A figura abaixo descreve o exemplo da entrada, e apresenta um caminho percorrido 
 em 5 segundos. Outros caminhos percorridos no mesmo tempo são possíveis, mas não 
 há outro caminho que pode ser percorrido em um tempo menor.

 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 dois inteiros N e M (2 <= N, M <= 100), o número de linhas e de colunas na cidade, 
 respectivamente. As próximas N linhas contém M inteiros cada, descrevendo a 
 cidade. O inteiro 0 indica uma posição em branco; o inteiro 1 indica a sua posição 
 na cidade; o inteiro 2 indica a posição do analógimôn na cidade. É garantido que 
 haverá exatamente um inteiro 1 e exatamente um inteiro 2 na descrição da cidade, 
 e que os demais inteiros serão iguais a 0.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima uma linha contendo o menor tempo necessário para 
 ir até o monstrinho, em segundos.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2520 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();
			int distancia = 0;
			int treinadorX = 0;
			int treinadorY = 0;
			int pokemonX = 0;
			int pokemonY = 0;
			for (int x = 0; x < N; x++) {
				for (int y = 0; y < M; y++) {
					int P = leitor.nextInt();
					if (P == 1) {
						treinadorX = x;
						treinadorY = y;
					}
					if (P == 2) {
						pokemonX = x;
						pokemonY = y;
					}
				}
			}
			
			if (treinadorX > pokemonX) distancia += (treinadorX - pokemonX);
			else if (pokemonX > treinadorX) distancia += (pokemonX - treinadorX);
			
			if (treinadorY > pokemonY) distancia += (treinadorY - pokemonY);
			else if (pokemonY > treinadorY) distancia += (pokemonY - treinadorY);
			
			System.out.println(distancia);
		}
	}
	
}