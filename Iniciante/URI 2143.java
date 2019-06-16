package Iniciante;

/*
 
 QUESTÃO
 Todo ano após a competição que ocorre na cidade de Taxilândia, os 
 participantes e os coaches vão para o célebre restaurante Radar. Porém, 
 os garçons (sempre muito gentis e educados) ficam sobrecarregados devido 
 à quantidade de pessoas, e consequentemente, acabam demorando um pouco 
 para atender a um pedido.

 Os participantes ou coaches que sentam nas pontas são os privilegiados, 
 pois são atendidos com somente um pedido, mas os demais precisam sempre 
 pedir duas vezes, pois os garçons (apesar de gentis e educados) são 
 desatentos e se esquecem facilmente dos pedidos. Além disso, há uma 
 superstição entre os participantes e coaches de que se não houver um 
 número par de pessoas que não sentam nas pontas, na próxima competição 
 nenhuma equipe da universidade conseguirá vencer.

 Portanto, sua tarefa é determinar a soma da quantidade de pedidos de 
 cada um para saber se vale a pena ir ao Radar. Mas apesar do resultado, 
 lembre-se: sempre vale a pena ir ao Radar!
 
 ENTRADA
 A entrada é composta por T (1 <= T <= 100) indicando a quantidade de casos 
 de teste e então, T inteiros N (3 <= N <= 104), indicando a quantidade de 
 pessoas. A mesa é retangular e haverá pelo menos e no máximo uma pessoa em 
 uma das pontas, isto é, se uma ponta estiver vazia, a outra deve ser ocupada, 
 ou senão, as duas pontas estarão ocupadas, mas o número de pessoas que não 
 estão nas pontas sempre será par. O final da entrada é indicado por T = 0.
 
 SAÍDA
 Seu programa deverá imprimir a soma da quantidade de pedidos de cada pessoa. 
 Não haverá linha em branco entre os casos de teste.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2143 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int N;
    	while (T != 0) {
    		for (int i = 1; i <= T; i++) {
    			N = leitor.nextInt();
    			if (N % 2 != 0) System.out.println((N * 2) - 1);
    			else System.out.println((N * 2) - 2);
    		}
    		
    		T = leitor.nextInt();
    	}
    }
	
}