package Ad-Hoc;

/*

 QUESTÃO
 O seu time de futebol favorito está jogando em um campeonato para caridade, 
 que é parte de um esforço mundial para levantar fundos para ajudar crianças 
 com dificuldades. Como em um campeonato normal, três pontos são dados ao 
 time que vence um partida, e nenhum para o time que perdeu. Se o jogo termina 
 em empate, cada time recebe um ponto.

 O seu time jogou N partidas durante a primeira fase do campeonato, que já terminou.
 Somente alguns times, os com mais pontos acumulados, irão avançar para a segunda 
 fase do campeonato. Porém como o objetivo principal do campeonato é arrecadar 
 dinheiro, antes de definir os times que passaram para a segunda fase, cada time 
 pode comprar gols adicionais. Estes gols contam como gols marcados, e podem ser 
 usados para alterar o resultado de qualquer partida que o time jogou.

 O orçamento do seu time é suficiente para comprar até G gols. Você pode informar 
 o número máximo de pontos que o seu time pode obter após comprar os gols, supondo 
 que os outros times não irão comprar nenhum gol?
 
 ENTRADA
 A entrada contém diversos casos de teste e termina com EOF. A primeira linha de um 
 caso de teste contém dois inteiros N (1 <= N <= 105) e G (0 <= G <= 106) representando 
 respectivamente o número de partidas que o seu time jogou e o número de gols que o 
 seu time pode comprar. Cada uma das próximas N linhas descrevem o resutado de uma 
 partida com dois inteiros S e R (0 <= S, R, <= 100), indicando respectivamente os gols 
 que o seu time marcou e sofreu na partida antes da compra de gols.
 
 SAÍDA
 Para cada caso de teste imprima uma linha com um inteiro representando o número 
 máximo total de pontos que o seu time pode obter após comprar os gols.
 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI 1495 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			
			List<Integer> derrotas = new ArrayList<>();
			int N = leitor.nextInt();
			int G = leitor.nextInt();
			int pontos = 0;
			
			for (int i = 0; i < N; i++) {
				int S = leitor.nextInt();
				int R = leitor.nextInt();
				
				if (S > R) {
					pontos += 3;
				} 
				
				else if (S == R) {
					if (G > 0) {
						G -= 1;
						pontos += 3;
					} else {
						pontos += 1;
					}
				}
				
				else {
					derrotas.add(R - S + 1);
				}
			}
			
			Collections.sort(derrotas);
			for (int derrota : derrotas) {
				if (G - derrota >= 0) {
					G -= derrota;
					pontos += 3;
					if (G == 0) break;
				} else if (G - derrota == -1) {
					pontos += 1;
					break;
				} else {
					break;
				}
			}
			
			System.out.println(pontos);
		}
	}

}