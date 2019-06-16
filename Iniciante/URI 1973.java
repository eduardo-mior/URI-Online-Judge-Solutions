package Iniciante;

/*
 
 QUESTÃO
 Após comprar vários sítios adjacentes na região do oeste catarinense, a 
 família Estrela construiu uma única estrada que passa por todos os sítios 
 em sequência. O primeiro sítio da sequência foi batizado de Estrela 1, o 
 segundo de Estrela 2, e assim por diante. Porém, o irmão que vive em 
 Estrela 1 acabou enlouquecendo e resolveu fazer uma Jornada nas Estrelas 
 para roubar carneiros das propriedades de seus irmãos. Mas ele está 
 definitivamente pirado. Quando passa pelo sítio Estrela i, ele rouba apenas 
 um carneiro daquele sítio (se o sítio tem algum) e segue ou para Estrela 
 i + 1 ou para Estrela i - 1, dependendo se o número de carneiros em Estrela 
 i era, respectivamente, ímpar ou par. Se não existe a Estrela para a qual 
 ele deseja seguir, ele interrompe sua jornada. O irmão louco começa sua 
 Jornada em Estrela 1, roubando um carneiro do seu próprio sítio.
 
 ENTRADA
 A primeira linha da entrada consiste de um único inteiro N (1 <= N <= 106), 
 o qual representa o número de Estrelas. A segunda linha da entrada consiste 
 de N inteiros, de modo que o i-ésimo inteiro, Xi (1 <= Xi <= 106), 
 representa o número inicial de carneiros em Estrela i.
 
 SAÍDA
 Imprima uma linha contendo dois inteiros, de modo que o primeiro represente 
 o número de Estrelas atacadas pelo irmão louco e o segundo represente o 
 número total de carneiros não roubados.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1973 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);	
    	int N = leitor.nextInt();
    	int[] estrela = new int[N];
    	int[] carneiro = new int[N];
    	long totalEstrela = 0;
    	long totalCarneiro = 0;
    	
    	for (int i = 0; i < N; i++) {
	    	carneiro[i] = leitor.nextInt();
	    	estrela[i] = 0;
    	}
    	
    	int j = 0;
    	
    	while (true) {
    		if (j == 0 && carneiro[j] % 2 == 0){
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (j == (N-1) && carneiro[j] % 2 == 1) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (carneiro[j] % 2 == 1) {
    			if (carneiro[j] > 0) carneiro[j]--;
    			estrela[j] = 1;
    			j++;
    		} else if (carneiro[j] % 2 == 0) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			j--;
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		totalCarneiro += carneiro[i];
    		totalEstrela += estrela[i];
    	}
    	
    	System.out.println(totalEstrela + " " + totalCarneiro);
    }
	
}