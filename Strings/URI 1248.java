package Strings;

/*

 QUESTÃO
 O doutor deu a você a sua dieta, na qual cada caractere corresponde a algum 
 alimento que você deveria comer. Você também sabe o que você tem comido no 
 café da manha e no almoço, nos quais cada caractere corresponde a um tipo de 
 alimento que você deveria ter comido aquele dia. Você decidiu que irá comer 
 todo o restante de sua dieta durante o jantar, e você quer imprimi-la como 
 uma String (ordenada em ordem alfabética). Se você trapaceou de algum modo 
 (ou por comer muito de tipo de alimento, ou por comer algum alimento que não 
 está no plano de dieta), você deveria imprimir a cadeia "CHEATER" (significa 
 trapaceiro), sem as aspas.
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de entrada contém 
 um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é 
 composto por três linhas, cada uma delas com uma string com até 26 caracteres 
 de 'A'-'Z' ou vazia, representando respectivamente os alimentos da dieta, do 
 café da manhã e do almoço.
 
 SAÍDA
 Para cada caso de teste imprima uma string que representa os alimentos que você 
 deveria consumir no jantar, ou "CHEATER" caso você tenha trapaceado na sua dieta.
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class URI 1248 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		leitor.nextLine();
		for (int i = 0; i < N; i++) {
			boolean cheater = false;
			String dieta  = leitor.nextLine();
			String cafe   = leitor.nextLine();
			String almoco = leitor.nextLine();
			
			for (char c : cafe.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			for (Character c : almoco.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			if (cheater) {
				System.out.println("CHEATER");
			} else {
				char[] string = dieta.toCharArray();
				Arrays.sort(string);
				System.out.println(new String(string));
			}
		}
	}

}