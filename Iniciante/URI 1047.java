package Iniciante;

/*
 
 QUESTÃO
 Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
 A seguir calcule a duração do jogo.

 Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

 ENTRADA
 Quatro números inteiros representando a hora de início e fim do jogo.
 
 SAÍDA
 Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1047 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int hInicio = leitor.nextInt();
		int mInicio = leitor.nextInt();
		int hFim = leitor.nextInt();
		int mFim = leitor.nextInt();
		int totalH = hFim - hInicio;
		int totalM = mFim - mInicio;
		
		if (totalH < 0) {
			totalH = 24 + (hFim - hInicio);
		}
		
		if (totalM < 0) {
			totalM = 60 + (mFim - mInicio);
			totalH--;
		}
		
		if (hInicio == hFim && mInicio == mFim) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");
	}
	
}