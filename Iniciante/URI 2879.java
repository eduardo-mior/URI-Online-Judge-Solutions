package Iniciante;

/*
 
 QUESTÃO
 No palco de um programa de auditório há três portas fechadas: porta 1, 
 porta 2 e porta 3. Atrás de uma dessas portas há um carro, atrás de cada 
 uma das outras duas portas há um bode. A produção do programa sorteia 
 aleatoriamente a porta onde vai estar o carro, sem trapaça. Somente o 
 apresentador do programa sabe onde está o carro. Ele pede para o jogador 
 escolher uma das portas. Veja que agora, como só há um carro, atrás de 
 pelo menos uma entre as duas portas que o jogador não escolheu, tem que 
 haver um bode!

 Portanto, o apresentador sempre pode fazer o seguinte: entre as duas portas 
 que o jogador não escolheu, ele abre uma que tenha um bode, de modo que o 
 jogador e os espectadores possam ver o bode. O apresentador, agora, pergunta 
 ao jogador: “você quer trocar sua porta pela outra porta que ainda está 
 fechada?”. E vantajoso trocar ou não? O jogador quer ficar com a porta que 
 tem o carro, claro!

 Paulinho viu uma demonstração rigorosa de que a probabilidade de o carro 
 estar atrás da porta que o jogador escolheu inicialmente é 1/3 e a 
 probabilidade de o carro estar atrás da outra porta, que ainda está fechada 
 e que o jogador não escolheu inicialmente, é 2/3 e, portanto, a troca é 
 vantajosa. Paulinho não se conforma, sua intuição lhe diz que tanto faz, 
 que a probabilidade é 1/2 para ambas as portas ainda fechadas...

 Neste problema, para acabar com a dúvida do Paulinho, vamos simular esse 
 jogo milhares de vezes e contar quantas vezes o jogador ganhou o carro. 
 Vamos supor que:

 • O jogador sempre escolhe inicialmente a porta 1;

 • O jogador sempre troca de porta, depois que o apresentador revela um 
   bode abrindo uma das duas portas que não foram escolhidas inicialmente.

 Nessas condições, em um jogo, dado o número da porta que contém o carro, 
 veja que podemos saber exatamente se o jogador vai ganhar ou não o carro.
 
 ENTRADA
 A primeira linha da entrada contém um inteiro N (1 <= N <= 104 ), indicando 
 o número de jogos na simulação. Cada uma das N linhas seguintes contém um 
 inteiro: 1, 2 ou 3; representando o número da porta que contém o carro naquele jogo.
 
 SAÍDA
 Seu programa deve produzir uma única linha, contendo um inteiro representando 
 o número de vezes que o jogador ganhou o carro nessa simulação, supondo que 
 ele sempre escolhe inicialmente a porta 1 e sempre troca de porta depois que 
 o apresentador revela um bode abrindo uma das duas portas que não foram 
 escolhidas inicialmente.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2879 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int vitorias = 0;
        for (int i = 0; i < N; i++) {
        	if (leitor.nextInt() != 1) vitorias++;
        }
        System.out.println(vitorias);
    }
	
}