package Strings;

/*

 QUESTÃO
 Textos podem conter mensagens ocultas. Neste problema a mensagem oculta em um 
 texto é composto pelas primeiras letras de cada palavra do texto, na ordem em que aparecem.

 É dado um texto composto apenas por letras minúsculas ou espaços. Pode haver 
 mais de um espaço entre as palavras. O texto pode iniciar ou terminar em espaços, 
 ou mesmo conter somente espaços.

 ENTRADA
 A entrada contém vários casos de testes. A primeira linha de entrada contém um inteiro N que 
 indica a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de uma 
 única linha contendo de um a 50 caracteres, formado por letras minúsculas (‘a’-‘z’) ou 
 espaços (‘ ’). Atenção para possíveis espaços no início ou no final do texto!

 Nota: No exemplo de entrada os espaços foram substituídos por pequenos pontos (‘·’) para 
 facilitar o entendimento dos exemplos.

 SAÍDA
 Para cada caso de teste imprima a mensagem oculta no texto de entrada.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1272 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String input = leitor.nextLine();
			if (input.isEmpty()) input = leitor.nextLine();
			String[] linhas = input.split(" ");
			String codigo = "";
			for (String linha : linhas) {
				if (!linha.isEmpty()) {
					codigo += linha.substring(0, 1);
				}
			}
			System.out.println(codigo);
		}
	}

}