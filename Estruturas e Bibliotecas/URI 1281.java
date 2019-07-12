package Estruturas e Bibliotecas;

/*

 QUESTÃO
 Dona Parcinova costuma ir regularmente à feira para comprar frutas e legumes. 
 Ela pediu então à sua filha, Mangojata, que a ajudasse com as contas e que 
 fizesse um programa que calculasse o valor que precisa levar para poder comprar 
 tudo que está em sua lista de compras, considerando a quantidade de cada tipo 
 de fruta ou legume e os preços destes itens.
 
 ENTRADA
 A primeira linha de entrada contém um inteiro N que indica a quantidade de idas 
 à feira de dona Parcinova (que nada mais é do que o número de casos de teste 
 que vem a seguir). Cada caso de teste inicia com um inteiro M que indica a 
 quantidade de produtos que estão disponíveis para venda na feira. Seguem os M 
 produtos com seus preços respectivos por unidade ou Kg. A próxima linha de entrada 
 contém um inteiro P (1 <= P <= M) que indica a quantidade de diferentes produtos 
 que dona Parcinova deseja comprar. Seguem P linhas contendo cada uma delas um 
 texto (com até 50 caracteres) e um valor inteiro, que indicam respectivamente o 
 nome de cada produto e a quantidade deste produto.
 
 SAÍDA
 Para cada caso de teste, imprima o valor que será gasto por dona Parcinova no 
 seguinte formato: R$ seguido de um espaço e seguido do valor, com 2 casas decimais, 
 conforme o exemplo abaixo.
 
*/

import java.util.Scanner;

public class URI 1281 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();

		for (int i = 0; i < N; i++) {
			double S = 0;
			int M = leitor.nextInt();

			String[] vNomeProduto = new String[M];
			double[] vPrecoProduto = new double[M];

			for (int k = 0; k < M; k++) {
				vNomeProduto[k] = leitor.next();
				vPrecoProduto[k] = leitor.nextDouble();
			}

			int P = leitor.nextInt();
			String[] vNomeProdutoX = new String[P];
			int[] vContagemProdutoX = new int[P];

			for (int j = 0; j < P; j++) {
				vNomeProdutoX[j] = leitor.next();
				vContagemProdutoX[j] = leitor.nextInt();
			}
			
			for (int l = 0; l < P; l++) {
				for (int m = 0; m < M; m++) {
					if (vNomeProduto[m].equalsIgnoreCase(vNomeProdutoX[l])) {
						S = (S + (vPrecoProduto[m]) * vContagemProdutoX[l]);
					}
				}
			}
			
			System.out.println(String.format("R$ %.2f", S));
		}
	}

}