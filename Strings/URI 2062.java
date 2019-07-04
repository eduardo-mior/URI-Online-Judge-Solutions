package Strings;

/*

 QUESTÃO
 Mariazinha criou um exercício para as suas irmãs Paula e Marta: ela distribui um 
 texto e pede que ambas corrijam este texto, sabendo que apenas as palavras OBI e 
 URI podem estar escritas de forma errada, e o erro pode estar apenas na última letra.

 Sua tarefa aqui é automatizar este processo, ou seja, criar um programa que faça a 
 correção dos textos distribuídos pela Mariazinha para que ela possa conferir as 
 correções de suas irmãs sem muito trabalho.

 Note que se "OB" ou "UR" forem o início ou parte de uma palavra maior, como por 
 exemplo "OBOS" ou "URAT"), estas palavras não devem ser alteradas.
 
 ENTRADA
 A entrada contém duas linhas. A primeira linha contém um valor inteiro N (1 < N < 10000) 
 que indica a quantidade de palavras do texto. A segunda linha contém as palavras do  texto, 
 cada uma com o máximo de 20 caracteres ('A'-'Z'), e com no mínimo, uma letra ('A'-'Z').
 
 SAÍDA
 Seu programa deverá apresentar o texto que foi distribuído por Mariazinha corrigido, 
 segundo os critérios acima estabelecidos.
 
*/

import java.util.Scanner;

public class URI 2062 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		String[] palavras = new String[N];
		for (int i = 0; i < N; i++) {
			String palavra = leitor.next();
			if (palavra.length() == 3) {
				if (palavra.startsWith("OB") || palavra.startsWith("UR") && !palavra.endsWith("I")) {
					palavra = palavra.substring(0, 2) + "I";
				}
			}
			palavras[i] = palavra;
		}
		System.out.println(String.join(" ", palavras));
	}

}