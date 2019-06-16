package Iniciante;

/*
 
 QUESTÃO
 Há muito tempo atrás, em uma galáxia muito, muito distante...

 Após o declínio do Império, sucateiros estão espalhados por todo o universo 
 procurando por um sabre de luz perdido. Todos sabem que um sabre de luz 
 emite um padrão de ondas específico: 42 cercado por 7 em toda a volta. Você 
 tem um sensor de ondas que varre um terreno com N x M células. Veja o exemplo 
 abaixo para um terreno 4 x 7 com um sabre de luz nele (na posição (2, 4)).

 Você deve escrever um programa que, dado um terreno N x M, procura pelo padrão 
 do sabre de luz nele. Nenhuma varredura tem mais do que um padrão de sabre de luz.
 
 ENTRADA
 A primeira linha da entrada tem dois números positivos N e M, representando, 
 respectivamente, o número de linhas e de colunas varridos no terreno (3 <= N, 
 M <= 1000). Cada uma das próximas N linhas tem M inteiros, que descrevem os 
 valores lidos em cada célula do terreno (-100 <= Tij <= 100, para 1 <= i <= N 
 e 1 <= j <= M).
 
 SAÍDA
 A saída é uma única linha com 2 inteiros X e Y separados por um espaço. Eles 
 representam a coordenada (X,Y) do sabre de luz, caso encontrado. Se o terreno 
 não tem um padrão de sabre de luz, X e Y são ambos zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2163 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int X = 0, Z = 0;
    	int N = leitor.nextInt();
    	int M = leitor.nextInt();
    	int[][] T = new int[N][M];
    	
    	for (int i = 0; i < T.length; i++) {
    		for (int j = 0; j < T[i].length; j++) {
    			T[i][j] = leitor.nextInt();
    		}
    	}
    	
    	for (int i = 1; i < (T.length-1); i++) {
    		for (int j = 1; j < (T[i].length-1); j++) {
    			if (T[i][j] == 42 && isTheSword(T, i, j)) {
    				System.out.println((i+1) + " " + (j+1));
    				return;
    			}
    		}
    	}
    	
    	System.out.println(0 + " " + 0);
    }
    
	private static boolean isTheSword(int[][] mat, int i, int j) {
		
		if ((mat[i-1][j-1] == 7) && (mat[i-1][j] == 7) && 
				 (mat[i-1][j+1] == 7) && (mat[i][j-1] == 7) &&
				 (mat[i+1][j-1] == 7) && (mat[i+1][j] == 7) && 
				 (mat[i+1][j+1] == 7) && (mat[i][j+1] == 7)) {
				 return true; }
		
		else { return false; }
	}
	
}