package Iniciante;

/*
 
 QUESTÃO
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração 
 do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
 tendo uma duração mínima de 1 hora e máxima de 24 horas.
 
 ENTRADA
 A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

 SAÍDA
 Apresente a duração do jogo conforme exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1046 {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		
int hInicial = leitor.nextInt();
int hFinal = leitor.nextInt();

if (hInicial > hFinal) { 
	System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
} else if (hFinal > hInicial) {
	System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
} else {
	System.out.println("O JOGO DUROU 24 HORA(S)");
}

    }
    
}