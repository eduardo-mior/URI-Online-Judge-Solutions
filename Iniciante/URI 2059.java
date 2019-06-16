package Iniciante;

/*
 
 QUESTÃO
 Um novo jogo chamado Ímpar, Par ou Roubo (IPR) está se tornando muito 
 popular. Esse jogo surgiu quando alguns amigos estavam sem conexão com 
 a internet, sem celular, sem computador e bastante desocupados. O jogo 
 está tão popular que irá acontecer um campeonato mundial de IPR e cada 
 país do mundo irá escolher um representante para competir.

 O jogo funciona da seguinte forma: dois jogadores participam, o jogador 1 
 escolhe entre par ou ímpar, então cada jogador escolhe um inteiro 
 positivo, se a soma desses números for par e o jogador 1 tiver escolhido 
 par então o jogador 1 ganha, se a soma for ímpar o jogador 2 ganha. Caso 
 o jogador 1 tivesse escolhido ímpar ele ganharia se a soma fosse ímpar, 
 caso a soma fosse par o jogador 2 ganharia. Nada de diferente de um jogo 
 de par ou ímpar convencional, correto?

 A diferença do jogo é que o jogador 1 pode roubar e assim assegurar sua 
 vitória independentemente do resultado do jogo de ímpar ou par convencional,
 já o jogador 2 pode ou não acusar o jogador 1 de roubo. Com essas adições 
 no jogo se o jogador 1 roubar e o jogador 2 acusar o roubo então o jogador 
 2 ganha, caso o jogador 2 não acuse o roubo e o jogador 1 roubar então o 
 jogador 1 ganha, caso o jogador 2 acuse o roubo, mas o jogador 1 não tiver 
 roubado então o jogador 1 ganha, se o jogador 1 não roubar e o jogador 2 
 não acusar o roubo o jogo segue como descrito anteriormente.

 Você foi contratado pela OIIPR (Organização Internacional de Ímpar, Par ou
 Roubo) para desenvolver um programa que dada a escolha do jogador 1 entre 
 par ou ímpar, os números escolhidos como jogada e as ações dos jogadores 
 (roubo/acusação) mostre quem foi o vencedor.
 
 ENTRADA
 A entrada consite de uma única linha contendo 5 inteiros: p, j1, j2, r, a. 
 ( 0 <= p, r, a <= 1 e 1 <= j1, j2 <= 100).

 p representa a escolha do jogador 1 (se p = 1 então o jogador 1 escolheu par, 
 se p = 0 então o jogador 1 escolheu ímpar). Os valores j1, j2, representam 
 respectivamente o número escolhido pelo jogador 1 e pelo jogador 2. r representa 
 se o jogador 1 roubou (se r = 1 então o jogador 1 roubou, se r = 0 então o 
 jogador 1 não roubou), a representa se o jogador 2 acusou o roubo (se a = 1 
 então o jogador 2 acusou o jogador 1 de roubo, se a = 0 então ele não acusou 
 o jogador 1 de roubo).
 
 SAÍDA
 Imprima "Jogador 1 ganha!" se o jogador 1 ganhou ou "Jogador 2 ganha!" se o 
 jogador 2 ganhou (sem as aspas).

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2059 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int p = leitor.nextInt();
    	int j1 = leitor.nextInt();
    	int j2 = leitor.nextInt();
    	int r = leitor.nextInt();
    	int a = leitor.nextInt();
    	
    	if (r == 1 && a == 0) System.out.println("Jogador 1 ganha!");
    	else if (r == 0 && a == 1) System.out.println("Jogador 1 ganha!");
    	else if (r == 1 && a == 1) System.out.println("Jogador 2 ganha!");
    	else if (p == 0 && (j1 + j2) % 2 != 0) System.out.println("Jogador 1 ganha!");
    	else if (p == 1 && (j1 + j2) % 2 == 0) System.out.println("Jogador 1 ganha!");
    	else System.out.println("Jogador 2 ganha!");
    }
	
}