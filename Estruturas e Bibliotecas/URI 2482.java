package Estruturas e Bibliotecas;

/*

 QUESTÃO
 Como de costume, neste ano Noel recebeu muitos pedidos de presentes. Só que em 
 função de alguns imprevistos, não terá como entregar todos os presentes 
 pessoalmente neste ano. Daí então decidiu utilizar o velho e bom correio 
 tradicional, para alguns pedidos que podem ser entregues por carta.

 Para esta tarefa, pediu ajuda ao elfo Evergreen Xadada, para que ele imprimisse 
 etiquetas a todos os envelopes que serão destinados a algumas destas crianças, 
 cujo pedido pode ser entregue por carta. Cada uma destas etiquetas deverá conter 
 apenas o nome da criança e a saudação "Feliz Natal" no respectivo idioma desta 
 criança. Para auxiliar nesta tarefa, Noel disponibilizou uma tabela com vários 
 idiomas e o nome e o país de cada uma das crianças selecionadas, de acordo com o 
 exemplo abaixo. Você deve ajudar Evergreen fazendo um programa que imprima estas etiquetas.
 
 ENTRADA
 A entrada é composta por um único caso de teste. A primeira linha de entrada 
 contém um inteiro N (1 < N < 100) que indica a quantidade de traduções da palavra 
 "Feliz Natal" existentes na entrada. As próximas N * 2 linhas contém respectivamente 
 o nome de uma língua seguido da tradução de "Feliz Natal" para esta língua. Segue um 
 inteiro M (1 < M < 100) que indica a quantidade de crianças que receberão as cartas. 
 As próximas M * 2 linhas conterão, respectivamente, o nome da criança e a língua nativa 
 desta criança.

 Obs.: É garantido que nenhuma tradução apareça repetida ou duplicada e os países de todas 
 as crianças estejam presentes na relação dos países.
 
 SAÍDA
 Seu programa deverá imprimir todas as etiquetas de acordo com a entrada, conforme o 
 exemplo abaixo, sempre com uma linha em branco após a impressão de cada uma das etiquetas, 
 inclusive após a última etiqueta.
 
*/

import java.util.HashMap;
import java.util.Scanner;

public class URI 2482 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, String> idiomas = new HashMap<>();
		
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String idioma = readLine(leitor);
			String mensagemTraduzida = readLine(leitor);
			idiomas.put(idioma, mensagemTraduzida);
		}
		
		int M = leitor.nextInt();
		for (int i = 0; i < M; i++) {
			String crianca = readLine(leitor);
			String idioma = readLine(leitor); 
			String mensagemTraduzida = idiomas.get(idioma);
			System.out.println(crianca);
			System.out.println(mensagemTraduzida);
			System.out.println();
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}