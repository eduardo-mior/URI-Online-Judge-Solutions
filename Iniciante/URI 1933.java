package Iniciante;

/*
 
 QUESTÃO
 Tri-du é um jogo de cartas derivado do popular jogo de Truco. O jogo 
 utiliza um baralho normal de 52 cartas, com treze cartas de cada naipe, 
 mas os naipes são ignorados. Apenas o valor das cartas,considerados 
 como inteiros de 1 a 13, são utilizados.

 No jogo, cada jogador recebe três cartas. As regras são simples:

 * Um trio (três cartas de mesmo valor) ganha de uma dupla (duas cartas de 
 mesmo valor).
 * Um trio formado por cartas de maior valor ganha de um trio formado por 
 cartas de menor valor.
 * Uma dupla formada por cartas de maior valor ganha de uma dupla formada por 
 cartas de menor valor.
 
 Note que o jogo pode não ter ganhador em muitas situações; nesses casos, as 
 cartas distribuídas são devolvidas ao baralho, que é embaralhado e uma nova 
 partida é iniciada

 Um jogador já recebeu duas das cartas que deve receber, e conhece seus 
 valores. Sua tarefa é escrever um programa para determinar qual o valor 
 da terceira carta que maximiza a probabilidade de esse jogador ganhar o jogo.
 
 ENTRADA
 A entrada consiste de uma ´unica linha que contém dois inteiros, 
 A (1 <= A <= 13) e B (1 <= B <= 13) indicando os valores das duas primeiras 
 cartas recebidas.
 
 SAÍDA
 Seu programa deve produzir uma única linha com um inteiro representando o 
 valor da carta que maximiza a probabilidade de o jogador ganhar a partida.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1933 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C;
		if (A == B) C = A;
		else if (A > B) C = A;
		else C = B;
		System.out.println(C);
    }
	
}