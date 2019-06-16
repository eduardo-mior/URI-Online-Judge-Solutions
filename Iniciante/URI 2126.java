package Iniciante;

/*
 
 QUESTÃO
 Dados dois números naturais N1 e N2, diz-se que N1 é subsequência contígua 
 de N2 se todos os dígitos de N1 aparecem, na mesma ordem e de forma 
 contígua, em N2. Crie uma aplicação que leia dois números naturais e diga 
 se o primeiro é uma subsequência contígua do segundo.
 
 ENTRADA
 A entrada é composta por vários casos de teste e termina com final de 
 arquivo (EOF). A primeira linha de cada entrada é composta por um valor 
 natural N1(1 < N1 < 1010), a segunda linha é composta por um valor N2( N1 < N2 < 1032).
 
 SAÍDA
 Para cada caso de teste imprima a quantidade de subsequências contíguas 
 e a posição onde a subsequência é iniciada, caso exista mais de uma 
 subsequência, imprima onde é iniciada a última subsequência. Caso não 
 exista subsequência, imprima "Nao existe subsequencia". Mostre o resultado 
 conforme o exemplo de saída.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2126 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int caso = 1, cont = 0, pos = 0, flag = 0;
    	String N1, N2;
    	while (leitor.hasNext()) {
    		cont = 0;
    		N1 = leitor.next();
    		N2 = leitor.next();
    		System.out.println("Caso #" + caso + ":");
    		
    		for (int i = 0; i < N2.length(); i++) {
    			if (N1.charAt(0) == N2.charAt(i)) {
    				flag = 0;
    				for (int j = 0; j < N1.length(); j++) {
    					if (i+j >= N2.length()) break;
    					if (N1.charAt(j) == N2.charAt(i+j)) flag++;
    				}
    				if (flag == N1.length()) {
    					cont++;
    					pos = i+1;
    				}
    			}
    		}
    		
    		if (cont == 0) {
    			System.out.println("Nao existe subsequencia");
    		} else {
    			System.out.println("Qtd.Subsequencias: " + cont );
    			System.out.println("Pos: " + pos);
    		}
    		
    		System.out.println("");
    		caso++;
    	}
    }
	
}