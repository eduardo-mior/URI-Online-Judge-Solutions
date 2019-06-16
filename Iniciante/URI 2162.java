package Iniciante;

/*
 
 QUESTÃO
 Ao observar a paisagem da Nlogônia, o professor MC percebeu que a cada 
 intervalo de 100 metros existe um pico. E que exatamente na metade de 
 dois picos há um vale. Logo, a cada 50 metros há um vale ou um pico e, 
 ao longo da paisagem, não há um pico seguido por outro pico, nem um vale 
 seguido por outro vale.

 O professor MC ficou curioso com esse padrão e quer saber se, ao medir 
 outras paisagens, isso se repete. Sua tarefa é, dada uma paisagem, indicar 
 se ela possui esse padrão ou não.
 
 ENTRADA
 A entrada é dada em duas linhas. A primeira tem o número N de medidas da 
 paisagem (1 < N <= 100). A segunda linha tem N inteiros: a altura Hi de 
 cada medida (-10000 <= Hi <= 10000, para todo Hi, tal que 1 <= i <= N). 
 Uma medida é considerada um pico se é maior que a medida anterior. Uma 
 medida é considerada um vale se é menor que a medida anterior.
 
 SAÍDA
 A saída é dada em uma única linha. Caso a paisagem tenha o mesmo padrão da 
 Nlogônia, deve ser mostrado o número 1. Caso contrário, mostra-se o número 0.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2162 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int H[] = new int[N];
    	int padrao = 0;
    	
    	for (int i = 0; i < N; i++) {
    		H[i] = leitor.nextInt();
    	}
    	
    	if (N > 2) {
	    	for (int i = 2; i < N; i++) {
	    		if ((H[i-2] > H[i-1] && H[i-1] < H[i]) || (H[i-2] < H[i-1] && H[i-1] > H[i])) {
	    			padrao = 1;
	    		} else {
	    			padrao = 0; 
		    		break;
	    		}
	    	}
    	} else { 
    		if (H[0] != H[1]) padrao = 1;
    	}
    	
    	System.out.println(padrao);
    }
	
}