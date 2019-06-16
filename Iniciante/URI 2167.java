package Iniciante;

/*
 
 QUESTÃO
 Ao observar a curva de velocidade de um motor, o engenheiro Zé percebeu que 
 sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms. 
 Mas esta queda acontecia em medidas diferentes a cada novo teste do motor.

 Zé ficou curioso com essa falta de padrão e quer saber, para cada teste do 
 motor, qual a primeira medida em que ocorre uma queda de velocidade.
 
 ENTRADA
 A entrada é um teste do motor e é dada em duas linhas. A primeira tem o número 
 N de medidas de velocidade do motor (1 < N <= 100). A segunda linha tem N 
 inteiros: o número de RPM (rotações por minuto) Ri de cada medida (0 <= Ri <= 
 10000, para todo Ri, tal que 1 <= i <= N). Uma medida é considerada uma queda 
 se é menor que a medida anterior.
 
 SAÍDA
 A saída é o índice da medida em que houve a primeira queda de velocidade no 
 teste. Caso não aconteça uma queda de velocidade a saída deve ser o número zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2167 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int[] R = new int[N];
    	int queda = 0;
    	for (int i = 0; i < N; i++) {
    		R[i] = leitor.nextInt();
    	}
    	for (int i = 0; i < N-1; i++) {
    		if (R[i] > R[i+1]) {
    			queda = i+2;
    			break;
    		}
    	}
    	System.out.println(queda);
    }
	
}