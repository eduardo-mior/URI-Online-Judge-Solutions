package Iniciante;

/*
 
 QUESTÃO
 Todo ano bissexto é realizado o exame geral de matemática da Nlogônia. 
 Todos os cidadões da nação são avaliados a fim de se estudar o 
 desenvolvimento lógico e matemático do país ao longo dos anos.

 Após as correções, os cidadões são ordenadados de acordo com suas notas 
 (quanto maior, melhor) e recebem descontos no imposto de renda de acordo 
 com sua qualificação.

 O Escritório Central de Estatística (ECE) é encarregado de processar os 
 dados das notas obtidas no exame. Entretanto este ano, Vasya, um dos 
 responsáveis, está internado no hospital com gripe H1N1 e você foi contratado 
 para realizar o seu trabalho.
 
 Escreva um programa que dado o número de habitantes da Nlogônia e todas as 
 notas obtidas, responda as consultas para retornar a nota do cidadão que 
 ficou em determinada posição.
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 dois inteiros N (1 <= N <= 100), Q (1 <= Q <= 100), o número de habitantes 
 do país e o número de consultas, respectivamente.

 As N linhas seguintes contém, cada uma, a nota ni obtida pelo i-ésimo cidadão 
 (0 <= ni <= 30000).

 As próximas Q linhas contém cada uma uma consulta, a posição pi 
 (1 <= pi <= N) a qual a ECE está interessada em saber a nota.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima, para cada consulta, uma linha contendo a 
 nota do cidadão que ficou classificado na posição pi.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2534 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int Q = leitor.nextInt();
			int[] notas = new int[N];
			for (int i = 0; i < N; i++) {
				notas[i] = leitor.nextInt();
			}
			quickSort(notas, 0, notas.length-1);
			for (int i = 0; i < Q; i++) {
				int consulta = notas[leitor.nextInt()-1];
				System.out.println(consulta);
			}
		}
	}

	private static void quickSort(int[] v, int inicio, int fim) {
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
			quickSort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			quickSort(v, up + 1, fim);
	}
	
}