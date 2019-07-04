package Strings;

/*

 QUESTÃO
 João quer montar um painel de leds contendo diversos números. Ele não possui 
 muitos leds, e não tem certeza se conseguirá montar o número desejado. 
 Considerando a configuração dos leds dos números abaixo, faça um algoritmo que 
 ajude João a descobrir a quantidade de leds necessário para montar o valor.

 ENTRADA
 A entrada contém um inteiro N, (1 <= N <= 1000) correspondente ao número de casos 
 de teste, seguido de N linhas, cada linha contendo um número (1 <= V <= 10100) 
 correspondente ao valor que João quer montar com os leds.
 
 SAÍDA
 Para cada caso de teste, imprima uma linha contendo o número de leds que João 
 precisa para montar o valor desejado, seguido da palavra "leds".
 
*/

import java.util.Scanner;

public class URI 1168 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String V = leitor.next();
			int leds = 0;
			for (int j = 0; j < V.length(); j++) {
				char c =  V.charAt(j);
				switch (c) {
					case '0': leds += 6; break;
					case '1': leds += 2; break;
					case '2': leds += 5; break;
					case '3': leds += 5; break;
					case '4': leds += 4; break;
					case '5': leds += 5; break;
					case '6': leds += 6; break;
					case '7': leds += 3; break;
					case '8': leds += 7; break;
					case '9': leds += 6; break;
				}
			}
			System.out.println(leds + " leds");
		}
	}

}