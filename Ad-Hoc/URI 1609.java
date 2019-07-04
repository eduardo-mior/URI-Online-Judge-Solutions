package Ad-Hoc;

/*

 QUESTÃO
 Para dormir você resolveu contar carneirinhos. O sono está demorando muito para vir e 
 você percebeu que alguns carneirinhos estão se repetindo! Cada um deles é identificado 
 por um número inteiro único, desta forma você vai evitar contar os repetidos.

 Dado a sequência dos carneirinhos, imprima quantos de verdade você contou, ou 
 seja, imprima o número de carneirinhos distintos.
 
 ENTRADA
 Na primeira linha você terá um inteiro T (T = 100*) indicando o número de casos de teste.

 Na primeira linha de cada caso teremos o número inteiro N (1 <= N <= 100* ou 1 <= N <= 104**), 
 indicando o número de carneirinhos. Na próxima linha teremos N inteiros separados por 
 espaço indicando a sequência de carneirinhos.

 Os identificadores dos carneiros irão de 0 até 109, inclusive.

 *Ocorre em aproximadamente 90% dos casos de teste;

 **Ocorre nos demais casos de teste.
 
 SAÍDA
 Imprima o número de carneirinhos distintos para cada caso.

*/

import java.util.HashSet;
import java.util.Scanner;

public class URI 1609 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 0; i < T; i++) {
			int N = leitor.nextInt();
			HashSet<Integer> numeros = new HashSet<>();
			for (int j = 0; j < N; j++) {
				numeros.add(leitor.nextInt());
			}
			System.out.println(numeros.size());
		}
    }

}