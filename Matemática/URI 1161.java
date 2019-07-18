package Matemática;

/*
 
 QUESTÃO
 Leia dois valores inteiros M e N indefinidamente. A cada leitura, calcule e 
 escreva a soma dos fatoriais de cada um dos valores lidos. Utilize uma variável 
 apropriada, pois cálculo pode resultar em um valor com mais de 15 dígitos.
 
 ENTRADA
 O arquivo de entrada contém vários casos de teste. Cada caso contém dois números 
 inteiros M (0 <= M <= 20) e N (0 <= N <= 20). O fim da entrada é determinado por eof.
 
 SAÍDA
 Para cada caso de teste de entrada, seu programa deve imprimir uma única linha, 
 contendo um número que é a soma de ambos os fatoriais (de M e N).
 
 */

import java.io.IOException;
import java.util.Scanner;

public class URI 1161 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int M = leitor.nextInt();
    		int N = leitor.nextInt();
    		long fatorial = fatorial(M) + fatorial(N);
    		System.out.println(fatorial);
    	}
    }
    
    public static long fatorial(int j) {
    	long fatorial = 1;
    	for(int i = 2; i <= j; i++)
    		fatorial *= i;
    	return fatorial;
    }
    
}