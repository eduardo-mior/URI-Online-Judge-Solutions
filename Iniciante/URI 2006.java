package Iniciante;

/*
 
 QUESTÃO
 Degustação de chá às escuras é a habilidade de identificar um chá usando 
 apenas seus sentidos do olfato e paladar.

 Isto faz parte da Competição Ideal de Consumidores de Chá Puro (da sigla 
 em inglês ICPC), que um programa de TV local está organizado. Durante o 
 show, um bule de chá completo é preparado e são entregues uma xícara de 
 chá para cada um dos cinco competidores. Os participantes devem cheirar, 
 saborear e avaliar a amostra, de modo a identificar o tipo de chá, que 
 pode ser: (1) o chá branco; (2) chá verde; (3) chá preto; ou (4) chá de 
 ervas. No final, as respostas são verificadas para determinar o número de 
 suposições corretas.

 Dado o tipo de chá real e as respostas fornecidas, determinar o número de 
 participantes que receberam a resposta correta.
 
 ENTRADA
 A primeira linha contém um inteiro T representando o tipo de chá (1 <= T <= 4). 
 A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta 
 dada por cada competidor (1 <= A, B, C, D, E <= 4).
 
 SAÍDA
 A saída contém um inteiro representando o número de concorrentes que obtiveram 
 a resposta correta.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2006 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int X, cont = 0;
    	for (int i = 0; i < 5; i++) {
    		X = leitor.nextInt();
    		if (X == T) cont++;
    	}
    	System.out.println(cont);
    }
	
}