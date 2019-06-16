package Iniciante;

/*
 
 QUESTÃO
 Em diversas competições acadêmicas, como a Olimpíada Brasileira de 
 Informática (OBI), uma certa quantidade de competidores se classifica de 
 uma fase para a fase seguinte, garantindo uma das vagas disponíveis. 
 Entretanto, normalmente essa quantidade é variável, pois dada uma certa 
 quantidade mínima de classificados, é frequente que haja empate na última 
 vaga de classificação. Neste caso, é comum que todos os competidores 
 empatados na última colocação se classifiquem.

 Sua tarefa é ajudar a calcular o número de competidores classificados para 
 a próxima fase. Você receberá uma lista de pontuações obtidas pelos 
 competidores e o número mínimo de vagas para a fase seguinte e você deve 
 decidir quantos competidores de fato vão se classificar.
 
 ENTRADA
 A primeira linha da entrada contém um número inteiro N, 1 <= N <= 1000, 
 representando o número de competidores. A segunda linha conterá um 
 inteiro K, 1 <= K <= N, indicando o número mínimo de competidores que 
 devem se classificar para a próxima fase. Em seguida, N linhas conterão, 
 cada uma um número entre 1 e 1000, inclusive, correspondente á pontuação de 
 um competidor.
 
 SAÍDA
 Seu programa deve imprimir uma linha, contendo o número de classificados 
 para a próxima fase.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2663 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int K = leitor.nextInt();
        int[] notas = new int[N];
        int classificados = K;
        for (int i = 0; i < N; i++) {
        	notas[i] = leitor.nextInt();
        }
        sort(notas, 0, notas.length -1);
        for (int i = K-1; i < N; i++) {
        	if (i + 1 < notas.length && notas[i + 1] == notas[i]) classificados++;
        	else break;
        }
        System.out.println(classificados);
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