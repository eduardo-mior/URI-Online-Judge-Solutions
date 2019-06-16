package Iniciante;

/*
 
 QUESTÃO
 Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos 
 a partir de X, um valor por linha, inclusive o X ser for o caso.
 
 ENTRADA
 A entrada será um valor inteiro positivo.

 SAÍDA
 A saída será uma sequência de seis números ímpares.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1070 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
    }
	
}