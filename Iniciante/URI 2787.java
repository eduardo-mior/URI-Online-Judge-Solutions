package Iniciante;

/*
 
 QUESTÃO
 No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) 
 é sempre branca e as cores das casas se alternam entre branca e preta, de 
 acordo com o padrão conhecido como... xadrez! Dessa forma, como o tabuleiro 
 tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 
 (canto inferior direito) será também branca. Neste problema, entretanto, 
 queremos saber a cor da casa no canto inferior direito de um tabuleiro com 
 dimensões quaisquer: L linhas e C colunas. No exemplo da figura, para L = 6 
 e C = 9, a casa no canto inferior direito será preta!
 
 ENTRADA
 A primeira linha da entrada contém um inteiro L (1 <= L <= 1000) indicando o 
 número de linhas do tabuleiro. A segunda linha da entrada contém um inteiro 
 C (1 <= C <= 1000) representando o número de colunas.
 
 SAÍDA
 Imprima uma linha na saída. A linha deve conter um inteiro, representando a 
 cor da casa no canto inferior direito do tabuleiro: 1, se for branca; e 0, se for preta.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2787 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int L = leitor.nextInt();
        int C = leitor.nextInt();
        if (L % 2 == C % 2) 
        	System.out.println(1);
        else
        	System.out.println(0);
    }
	
}