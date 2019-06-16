package Iniciante;

/*
 
 QUESTÃO
 O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá 
 parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma 
 dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o 
 valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado 
 da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por 
 exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
 
 ENTRADA
 O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

 SAÍDA
 Imprima a saída conforme a explicação acima e o exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1159 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int soma=0, cont=0;
        while (X != 0) {
        	cont = 0;
        	soma = 0;
        	while (cont < 5) {
        		if (X % 2 == 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        	X = leitor.nextInt();
        }
    }
	
}