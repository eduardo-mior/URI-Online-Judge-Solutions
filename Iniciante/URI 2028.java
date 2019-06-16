package Iniciante;

/*
 
 QUESTÃO
 Hyam é um menino que adora sequências. Ele anda descobrindo sequências 
 interessantes que nem mesmo Fibonacci imaginaria. Certo dia, Hyam percebeu 
 que dado um número N, ele poderia fazer uma sequência do tipo 0 1 2 2 3 3 3 
 4 4 4 4 ... N N N ... N. No entanto, Hyam percebeu que cada valor que 
 aumentava no número da sequência, a quantidade total de números da sequência 
 aumentava semelhantemente à um crescimento fatorial, neste caso, ao invés de 
 multiplicar, soma-se o número total de números da sequência com o valor do 
 próximo número da sequência. Por exemplo, se N = 2. A sequência correta seria 
 0 1 2 2, obtendo-se 4 digitos. Agora, se N = 3, o próximo número da sequência 
 tem valor 3, então a quantidade total de número da sequência seria a 
 quantidade de números com N = 2, que é 4, mais o valor do próximo número da 
 sequência, neste caso 3, obtendo-se 7, já que a sequência correta para 
 N = 3 é 0 1 2 2 3 3 3.

 Sua tarefa é fazer um algoritmo que dado um número inteiro N, tenha como 
 resposta a quantidade total de números dessa sequência e logo abaixo a 
 sequência completa.
 
 ENTRADA
 A entrada é composta de vários casos de testes. Cada caso é composto por um 
 inteiro N (0<=N<=200) que indica o valor dos últimos N números da sequência.

 A entrada termina com final de arquivo (EOF).
 
 SAÍDA
 A saída é no formato Caso X: N numeros onde X é a ordem do número de casos e 
 N é a quantidade de numeros que contém na sequência completa, na próxima 
 linha a sequência de números com um espaço entre eles. É pedido que deixe 
 uma linha em branco após cada caso.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2028 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int caso = 1;
    	int N , numeros;
    	while (leitor.hasNext()) {
    		N = leitor.nextInt();
    		numeros = 1;
    		
    		for (int i = 1; i <= N; i++) {
    			numeros += i;
    		}
    		
    		System.out.println("Caso " + caso + ": " + numeros + " numero" + (numeros == 1 ? "" : "s"));
    		
    		for (int i = 0; i <= N; i++) {
    			if (i == 0) System.out.print(N > 0 ? "0 ": "0");
    			for (int j = 0; j < i; j++) {
    				if (i == N && j == N-1) System.out.print(i);
    				else System.out.print(i + " ");
    			}
    		}
    		
    		System.out.println("\n");
    		caso++;
    	}
    }
	
}