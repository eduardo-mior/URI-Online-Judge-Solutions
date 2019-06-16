package Iniciante;

/*
 
 QUESTÃO
 A fórmula de Binet é uma forma de calcular números de Fibonacci. http://prntscr.com/k4ies0

 Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.
 
 ENTRADA
 A entrada é um número natural n (0 < n <= 50).

 SAÍDA
 A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2164 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double N = leitor.nextInt();
    	double fib = (Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5);
    	System.out.println(String.format("%.1f", fib));
    }
	
}