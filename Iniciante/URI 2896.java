package Iniciante;

/*
 
 QUESTÃO
 Um supermercado está fazendo uma promoção de venda de refrigerantes. Se um dia 
 você comprar refrigerantes e levar os cascos vazios no dia seguinte, ela troca 
 cada conjunto de K garrafas vazias  por uma garrafa cheia. Um cliente quer 
 aproveitar ao máximo essa oferta e por isso comprou várias garrafas no primeiro 
 dia da promoção. Agora ele quer saber quantas garrafas terá ao final do segundo 
 dia da promoção, se usá-la ao máximo.

 Faça um programa para calcular isso.

 ENTRADA
 A primeira linha de entrada contém inteiro T (1 <= T <= 10000) , que indica o 
 número de casos de teste. Em cada uma das T linhas a seguir vêm dois inteiros 
 N e K (1 <= K, N <= 10000),  respectivamente o número de refrigerantes comprados 
 e o número de garrafas vazias para ganhar uma cheia.
 
 SAÍDA
 Para cada caso de teste imprima o número de garrafas que o cliente terá no 
 segundo dia, se aproveitar ao máximo a oferta.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2896 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for (int i = 0; i < T; i++) {
        	int N = leitor.nextInt();
        	int K = leitor.nextInt();
        	System.out.println((N % K) + (N / K));
        }
    }
	
}