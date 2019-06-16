package Iniciante;

/*
 
 QUESTÃO
 No oitavo episodio da segunda temporada do seriado The Big Bang Theory, 
 The Lizard-Spock Expansion, Sheldon e Raj discutem qual dos dois é o 
 melhor: o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj 
 para a resolução do impasse é uma disputa de Pedra-Papel-Tesoura. 
 Contudo, Sheldon argumenta que, se as partes envolvidas se conhecem, 
 entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, 
 e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

 As regras do jogo proposto são:

 a tesoura corta o papel;
 o papel embrulha a pedra;
 a pedra esmaga o lagarto;
 o lagarto envenena Spock;
 Spock destrói a tesoura;
 a tesoura decapita o lagarto;
 o lagarto come o papel;
 o papel contesta Spock;
 Spock vaporiza a pedra;
 a pedra quebra a tesoura.
 
 Embora a situação não se resolva no episódio (ambos escolhem Spock, resultando 
 em um empate), não é difícil deduzir o que aconteceria se a disputa continuasse. 
 Caso Sheldon vencesse, ele se deleitaria com a vitória, exclamando "Bazinga!"; 
 caso Raj vencesse, ele concluiria que "Raj trapaceou!"; caso o resultado fosse 
 empate, ele exigiria nova partida: "De novo!". Conhecidas as personagens do jogo 
 escolhido por ambos, faça um programa que imprima a provável reação de Sheldon.
 
 ENTRADA
 A entrada consiste em uma série de casos de teste. A primeira linha contém um 
 inteiro positivo T (T <= 100), que representa o número de casos de teste. Cada 
 caso de teste é representado por uma linha da entrada, contendo as escolhas de 
 Sheldon e Raj, respectivamente, separadas por um espaço em branco. As escolha 
 possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.
 
 SAÍDA
 Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é o 
 número do caso de teste (cuja contagem se inicia no número um) e R é uma das três 
 reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!".
 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI 1828 {
	
    public static void main(String[] args) throws IOException {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(leitor.readLine());
        String escolhas, sheldon, raj;
        for (int i = 1; i <= N; i++) {
        	escolhas = leitor.readLine();
        	sheldon = escolhas.split(" ")[0];
        	raj = escolhas.split(" ")[1];
        	if (sheldon.equalsIgnoreCase(raj)) System.out.println("Caso #" + i + ": De novo!");
        	else if (escolhas.equalsIgnoreCase("tesoura papel")) System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("papel pedra"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("pedra lagarto"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("lagarto spock"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("spock tesoura"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("tesoura lagarto"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("lagarto papel"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("papel spock"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("spock pedra")) System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("pedra tesoura")) System.out.println("Caso #" + i + ": Bazinga!");
        	else System.out.println("Caso #" + i + ": Raj trapaceou!");
        }
    }
	
}