package Iniciante;

/*
 
 QUESTÃO
 O MacPRONALTS está com uma super promoção, exclusivo para os competidores 
 da primeira Seletiva do MaratonaTEC. Só que teve um problema, todos os 
 maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila 
 muito grande. O pior é que a moça do caixa estava sem calculadora ou um 
 programa para ajudá-la a calcular com maior agilidade, eis que surge você 
 para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. 
 Segue o cardápio do dia contendo o número do produto e seu respectivo valor.

 1001 | R$ 1.50

 1002 | R$ 2.50

 1003 | R$ 3.50

 1004 | R$ 4.50

 1005 | R$ 5.50
 
 ENTRADA
 A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). 
 Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.
 
 Obs.: não poderão ser informados números de produtos repetidos.

 SAÍDA
 Você deve imprimir o valor da compra com duas casas decimais.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1985 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int p = leitor.nextInt();
    	double total = 0;
    	int q, c;
    	for (int i = 0; i < p; i++) {
    		c = leitor.nextInt();
    		q = leitor.nextInt();
    		switch (c) {
    			case 1001: total += q * 1.50; break;
    			case 1002: total += q * 2.50; break;
    			case 1003: total += q * 3.50; break;
    			case 1004: total += q * 4.50; break;
    			case 1005: total += q * 5.50; break;
    		}
    	}
    	System.out.println(String.format("%.2f", total));
    }
	
}