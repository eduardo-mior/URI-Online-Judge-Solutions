package Iniciante;

/*
 
 QUESTÃO
 Giovana ficou muito feliz por conseguir mandar sua carta para o papai Noel e 
 receber ótimos presentes. A alegria foi tanta que ela resolveu até convidar 
 todos os duendes do bom velhinho para sua festa de aniversário, que é pouco 
 depois do Natal, em Janeiro. Porém, ela não quer que o Grinch apareça na sua 
 festinha para estragar tudo, então ela bolou um plano.

 Para esconder do malvado Grinch onde será a festa, ela resolveu ultilizar o 
 sistema de reuniões dos Duendes, que funciona assim: cada duende tem um 
 identificador numérico único e, quando haverá uma reunião, é escolhida a casa 
 de um dos duendes para sediar o encontro. Mas ao invés de escrever o número 
 do duende anfitrião no mural da fábrica do Papai Noel, onde todos podem ver, 
 é escrito o identificador de exatamente todos os duendes com números menores 
 que o dele e que são coprimos ao dele. Esse método é também uma forma de dizer
  que esses duendes do mural devem levar as comidas e bebidas para a reunião.

 Como o Grinch é tão ruim com números a ponto de nem saber que dois números só 
 são chamados de coprimos se o MDC (máximo divisor comum) entre eles é 1, 
 Giovana simplesmente envia uma carta para o polo norte com os números dos 
 duendes que devem levar as comidas, e com isso, os duendes já conseguem 
 descobrir onde será a festa de aniversário, mas o Grinch não.

 Dada a carta que os duendes receberam, determine na casa de qual Duende será 
 a festa de aniversário de Giovana.
 
 ENTRADA
 A primeira linha da entrada contém um inteiro N (1 <= N <= 104) o qual 
 representa a quantidade de números escritos na carta de Giovana. A segunda 
 linha da entrada possui N números inteiros Ai (1 <= Ai <= 105) representando 
 os identificadores dos duendes escritos na carta.
 
 SAÍDA
 A saída consiste de uma única linha contendo o número do duende que sediará 
 a festa de Giovana em sua casa.

*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class URI 2845 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = leitor.nextInt();
		Arrays.sort(A);
		for (int i = A[A.length-1] + 1; true; i++)  {
			boolean bol = true;
			for (int j : A) {
				if (mdc(j, i) != 1) {
					bol = false;
					break;
				}
			}
			if (bol) {
				System.out.println(i);
				break;
			}
		}
	}
	
    private static int mdc(int a, int b){
        if (a == 0) 
        	return b;
        return mdc( b % a, a );
    }
	
}