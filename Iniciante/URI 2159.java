package Iniciante;

/*
 
 QUESTÃO
 Schoenfeld e Rosser publicaram em 1962 um artigo descrevendo um valor 
 mínimo e máximo para a quantidade de números primos até n, para n >= 17. 
 Esta quantidade é representada pela função (n) e a fórmula é mostrada abaixo.
 
 Sua tarefa é, dado um natural n, calcular o mínimo e máximo do intervalo 
 para o número aproximado de primos até n.
 
 ENTRADA
 A entrada é um número natural n (17 <= n <= 109).

 SAÍDA
 A saída são dois valores P e M com 1 casa decimal cada, tal que P < (n) < M, 
 de acordo com a fórmula dada acima. Os valores devem ser separados por um 
 espaço em branco.
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI 2159 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	long n = leitor.nextLong();
    	double P = n / Math.log(n);
    	double M = 1.25506 * (n / Math.log(n));
    	System.out.println(df.format(P) + " " + df.format(M));
    }
	
}
