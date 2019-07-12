package Strings;

/*

 QUESTÃO
 Então, nós temos que admitir: precisamos da sua ajuda. Esse ano as coisas não estao 
 correndo tão tranquilamente quanto queríamos, e nós não conseguimos finalizar o 
 sistema do software da competição a tempo. Uma parte vital está faltando, e como 
 você sabe, nós precisamos desse sistema funcionando até essa tarde, para a verdadeira 
 competição. A parte que está faltando é a que computa a pontuação dos times, dada a 
 lista de submissões desse time.

 Por favor, por favor, alguém nos ajude!
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de caso de teste contém um 
 único inteiro N indicando o número de submissões do caso de teste (1 <= N <= 300). 
 Cada uma das N linhas seguintes descrevem uma submissão; cada uma dessas linhas 
 contém um identificador de problema (uma única letra entre 'A' e 'Z'), seguida por 
 um inteiro T representando o tempo em minutos (0 <= T <= 300), seguido por um 
 julgamento (a palavra "correct", correto, ou a palavra "incorrect", incorreto).

 A entrada está em ordem crescente de tempo, e haverá no máximo um julgamento "correct" 
 para cada problema. O final da entrada é indicado por N = 0. A entrada deve ser lida da 
 entrada padrão.
 
 SAÍDA
 Para cada caso de teste a entrada do seu programa deve imprimir uma linha contendo 
 dois inteiros S e P, separados por um espaço, onde S é o número de problemas distintos 
 com o julgamento "correct" e P é o tempo no qual cada problema distinto foi julgado pela 
 primeira vez como "correct", somado a 20 para cada julgamento "incorrect" recebido nesse 
 problema (desde que no final o problema tenha sido julgado como "correct"). A saída 
 deve ser escrita na saída padrão.
 
*/

import java.util.HashMap;
import java.util.Scanner;

public class URI 1367 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			if (N == 0) break;
			HashMap<Character, Integer> problemasResolvidos = new HashMap<>();
			HashMap<Character, Integer> problemas = new HashMap<>();
			for (int i = 0; i < N; i++) {
				char identificador = leitor.next().charAt(0);
				int tempo = leitor.nextInt();
				String julgamento = leitor.next();
				if (julgamento.equals("correct")) {
					if (problemas.containsKey(identificador) ) {
						tempo += problemas.get(identificador);
					}
					problemasResolvidos.put(identificador, tempo);
				} else {
					int penalidade = 20;
					if (problemas.containsKey(identificador) ) {
						penalidade += problemas.get(identificador);
					}
					problemas.put(identificador, penalidade);
				}
			}
			System.out.println(problemasResolvidos.size() + " " + problemasResolvidos.values().stream().reduce(0, Integer::sum));
		}
	}

}