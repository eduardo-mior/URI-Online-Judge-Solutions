package Iniciante;

/*

 QUESTÃO
 Leia um valor inteiro N. Apresente o quadrado de cada um dos valores 
 pares, de 1 até N, inclusive N, se for o caso.

 ENTRADA
 A entrada contém um valor inteiro N (5 < N < 2000).

 SAÍDA
 Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme 
 o exemplo abaixo.

 Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 
 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, 
 configure a precisão adequadamente para que isso não ocorra.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1073 {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 1; i <= N; i++) {
    		if (i % 2 == 0) System.out.println(i + "^2 = " + (i * i));
    	}
	}
	
}