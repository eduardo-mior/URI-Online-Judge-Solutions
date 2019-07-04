package Strings;

/*

 QUESTÃO
 Uma sentença é chamada de dançante se sua primeira letra for maiúscula e 
 cada letra subsequente for o oposto da letra anterior. Espaços devem ser 
 ignorados ao determinar o case (minúsculo/maiúsculo) de uma letra. Por 
 exemplo, "A b Cd" é uma sentença dançante porque a primeira letra ('A') é 
 maiúscula, a próxima letra ('b') é minúscula, a próxima letra ('C') é 
 maiúscula, e a próxima letra ('d') é minúscula.
 
 ENTRADA
 A entrada contém vários casos de teste. Cada caso de teste é composto por 
 uma linha que contém uma sentença, que é uma string que contém entre 1 e 50 
 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
 
 SAÍDA
 Transforme a sentença de entrada em uma sentença dançante (conforme o exemplo 
 abaixo) trocando as letras para minúscula ou maiúscula onde for necessário. 
 Todos os espaços da sentença original deverão ser preservados, ou seja, " sentence " 
 deverá ser convertido para " SeNtEnCe ".
 
*/

import java.util.Scanner;

public class URI 1234 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNextLine()) {
			boolean upper = true;
			StringBuilder frase = new StringBuilder(leitor.nextLine());
			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (upper) 	frase.setCharAt(i, Character.toUpperCase(c));
					else 		frase.setCharAt(i, Character.toLowerCase(c));
					upper =! upper;
				}
			}
			System.out.println(frase);
		}
	}
	
}