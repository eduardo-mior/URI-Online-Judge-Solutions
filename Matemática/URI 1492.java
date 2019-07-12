package Matemática;

/*

 QUESTÃO
 Carl é agora a criança mais feliz do mundo: ele aprendeu esta manhã o que é o 
 sistema binário. Ele aprendeu, por exemplo, que a representação binária de um 
 inteiro positivo k é  uma string anan-1 · · · a1a0 onde cada ai é um dígito 
 binário 0 ou 1, iniciando com an = 1, e de tal forma que k = Eni=0 ai × 2i. É 
 realmente bom ver ele transformando números decimais em binários, e depois 
 somá-los e multiplicá-los.

 César é o irmão mais velho de Cal, e ele não suporta ver o seu irmão menor tão 
 feliz. Por isso ele preparou um desafio: "Olhe Carl, eu tenho uma pergunta fácil 
 para você: eu te darei dois inteiros A e B, e você tem que me dize quantos 
 dígitos 1 existem na representação binária de todos os inteiros de A à B, 
 inclusive. Se prepare!". Carl aceitou o desafio.

 Após alguns minutos, ele voltou com uma lista com a representação binária de 
 todos os inteiros de 1 a 100. "César, eu estou pronto". César sorriu e disse: 
 "Bom, deixe-me ver, eu escolho A = 1015 e B = 1016. A sua lista não será útil". 

 Carl odeia perder para o seu irmão então ele precisa de uma solução mais rápida. 
 Você pode ajudá-lo?
 
 ENTRADA
 A entrada é composta por diversos casos de teste e termina com EOF. Cada caso 
 de teste consiste de uma linha com dois inteiros A e B (1 <= A <= B <= 1016).
 
 SAÍDA
 Para cada caso de teste, imprima uma linha contendo um inteiro que representa o número 
 total de dígitos 1 na representação binária de todos os inteiros de A to B, inclusive.
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class URI 1492 {

	public static long[][][] dp = new long[60][60][2];

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			long a = leitor.nextLong();
			long b = leitor.nextLong();
			a--;

			memset(dp, -1);
			long ans = go(b, 55, 0, true);
			memset(dp, -1);
			
			ans -= go(a, 55, 0, true);
			System.out.println(ans);
		}
	}
	
	public static long go(long n, int i, int acc, boolean top) {
		if (i == -1)
			return acc;

		if (dp[i][acc][top ? 1 : 0] != -1)
			return dp[i][acc][top ? 1 : 0];

		long ans = go(n, i - 1, acc, !(((n >> i) & 1L) != 0) && top);
		if (!top || ((n >> i) & 1) != 0)
			ans += go(n, i - 1, acc + 1, ((n >> i) & 1L) != 0 && top);

		return dp[i][acc][top ? 1 : 0] = ans;
	}
	
	public static void memset(long[][][] array, int value) {
		for (long[][] dps1 : array) {
			for (long[] dps2 : dps1) {
				Arrays.fill(dps2, -1);
			}
		}
	}

}