package Iniciante;

/*
 
 QUESTÃO
 Pedra, Papel, Ataque Aéreo é um jogo infantil muito popular, em que duas 
 ou mais crianças formam um círculo e fazem gestos com a mão na tentativa 
 de obter a vitória. As regras são surpreendentemente complexas para um jogo 
 de crianças, mas mesmo assim é bastante popular por todo o mundo.
 As partidas são muito simples. Os jogadores podem escolher entre o sinal de 
 uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o sinal para o 
 Ataque Aéreo (igual o do Papel, mas com apenas o polegar e o mindinho 
 estendidos).
 
 Uma partida, com dois jogadores, possuem as seguintes regras para se definir
 um vencedor:

 * Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota 
 o jogador com a Pedra, por razões óbvias.
 * Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, 
 porque a Pedra machuca muito mais.
 * Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo 
 sempre ganha e o Papel é patético.
 * Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel 
 é inútil e ninguém que enfrenta o Papel pode perder.
 * Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os 
 jogadores decidem fazer com a Pedra e normalmente não fazem nada.
 * Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores 
 perdem, devido a Aniquilação Mútua.
 * Sua tarefa é escrever um programa que, dada as escolhas de dois jogadores, 
 informe quem venceu o jogo.

 ENTRADA
 A entrada consiste de N (1 <= N <= 1000) casos de teste. N deve ser lido na 
 primeira linha da entrada. Cada caso de teste é composto por duas linhas, 
 cada uma contendo uma string. A primeira string representa o sinal escolhido 
 pelo jogador 1 e a segunda string representa o sinal escolhido pelo jogador 2. 
 Essas strings podem ser:

 * “ataque”: para representar o Ataque Aéreo
 * “pedra”: para representar a Pedra
 * “papel”: para representar o Papel
 
 SAÍDA
 A saída deve conter o seguinte:

 * “Jogador 1 venceu”: se o Jogador Um tiver vencido a partida
 * “Jogador 2 venceu”: se o Jogador Dois tiver vencido a partida
 * “Ambos venceram”: se os dois jogadores tiverem vencido a partida
 * “Sem ganhador”: se não houver ganhador
 * “Aniquilacao mutua”: se ocorrer Aniquilação Mútua
 
 Cada saída de um caso de teste deve estar em uma linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2031 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	String jogador1, jogador2;
    	for (int i = 0; i < N; i++) {
    		jogador1 = leitor.next();
    		jogador2 = leitor.next();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
    		else System.out.println("Sem ganhador");
    	}
    }
	
}