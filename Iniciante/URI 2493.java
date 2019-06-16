package Iniciante;

/*
 
 QUESTÃO
 Samu Elmito adora criar jogos peculiares para desafiar seus amigos. Desta 
 vez, ele inventou um jogo chamado "Jogo do Operador", em que ele cria 
 expressões básicas e cada jogador deve escolher uma expressão e preencher 
 a lacuna com o operador correto para validá-la. Os jogadores poderão escolher 
 operadores de somente três tipos: adição, subtração e multiplicação. Porém, 
 se o jogador achar que não há operador entre os três tipos que valide a 
 expressão, poderá responder Impossível.

 Sua tarefa é simples: dadas as expressões e as respostas dos jogadores, 
 determinar os jogadores que não passarão para a outra fase do jogo.
 
 ENTRADA
 A entrada é composta por um inteiro T (2 <= T <= 50) que indica a quantidade 
 de expressões e de jogadores. Cada caso de teste é composto por T expressões 
 na forma "X Y=Z", indicando que X operador Y (0 <= X, Y <= 103) é igual a Z 
 (-103 <= Z <= 106), seguido de T jogadores e suas respectivas respostas na 
 forma "N E R", sendo N o nome do jogador (até 50 caracteres e sem espaços), 
 E o índice da expressão escolhida (1 <= E <= T) e R a resposta (+, -, * ou I, 
 indicando Impossível). A entrada termina com EOF (fim de arquivo).
 
 SAÍDA
 Para cada caso de teste, se todos os jogadores passarem, imprima "You Shall 
 All Pass!"; se nenhum jogador passar, imprima "None Shall Pass!"; caso 
 contrário, imprima, em ordem lexicográfica e entre espaços, o nome dos 
 jogadores que erraram a resposta e, desta forma, não passarão para a próxima 
 fase do jogo.
 
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class URI 2493 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			String ln = leitor.nextLine();
			while (ln.equals("")) {
				ln = leitor.nextLine();
			}
			int T = Integer.valueOf(ln.trim());
			String[] jogadas = new String[T];
			String[] respostas = new String[T];
			SortedSet<String> players = new TreeSet<>();
			
			for (int i = 0; i < T; i++) {
				String line = leitor.nextLine();
				while (line.equals("")) {
					line = leitor.nextLine();
				}
				jogadas[i] = line.replace(' ', '=');
			}
			
			for (int i = 0; i < T; i++) {
				String line = leitor.nextLine();
				while (line.equals("")) {
					line = leitor.nextLine();
				}
				respostas[i] = line;
			}
			
			for (int i = 0; i < T; i++) {
				String[] resposta = respostas[i].split(" ");
				String player = resposta[0];
				int index = Integer.valueOf(resposta[1].trim()) - 1;
				char operacao = resposta[2].charAt(0);
				String[] jogada = jogadas[index].split("=");
				int n0 = Integer.valueOf(jogada[0].trim());
				int n1 = Integer.valueOf(jogada[1].trim());
				int n2 = Integer.valueOf(jogada[2].trim());
				if (!respostaValida(n0, n1, n2, operacao)) {
					players.add(player);
				}
			}
			
			if (players.size() == T) {
				System.out.println("None Shall Pass!");
			} else if (players.size() == 0) {
				System.out.println("You Shall All Pass!");
			} else {
				System.out.println(String.join(" ", players));
			}
			players.clear();
		}
		leitor.close();
	}
	
	private static boolean respostaValida(int n0, int n1, int n2, char operacao) {
		switch (operacao) {
			case '*': return n0 * n1 == n2;
			case '+': return n0 + n1 == n2;
			case '-': return n0 - n1 == n2;
			case 'I': return (n0 * n1 != n2) && (n0 + n1 != n2) && (n0 - n1 != n2); 
			default: return true;
		}
	}
	
}