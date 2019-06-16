package Iniciante;

/*
 
 QUESTÃO
 Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 
 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido 
 apenas pelo número 1 e pelo número 7.
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha da entrada contém 
 um inteiro N (1 <= N <= 100), indicando o número de casos de teste da entrada. 
 Cada uma das N linhas seguintes contém um valor inteiro X (1 < X <= 107), que 
 pode ser ou não, um número primo.
 
 SAÍDA
 Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao 
 eh primo”, de acordo com a especificação fornecida.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1165 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int X, cont;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	X = leitor.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " eh primo");
        	else System.out.println(X + " nao eh primo");
        }
    }
	
}