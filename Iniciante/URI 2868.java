package Iniciante;

/*
 
 QUESTÃO
 Tausfão apresenta um programa de televisão o qual dá prêmios aos participantes 
 que respondem corretamente a cálculos matemáticos. Quando os participantes erram, 
 ele ressalta o quão longe a resposta está da esperada. Levando em consideração 
 somente as respostas erradas, ajude o Tausfão informando como deve ser a pronúncia 
 do erro do participante.
 
 ENTRADA
 A entrada é composta por vários casos de teste. A primeira linha contém um número 
 inteiro C, representando a quantidade de casos de teste. As próximas C linhas serão 
 formadas por um número inteiro, seguido por um espaço, um caractere de operação 
 (adição, subtração ou multiplicação), outro número inteiro, mais um espaço, um sinal 
 de igualdade, outro espaço e, por fim, um número inteiro, representando o resultado 
 dito pelo participante em relação ao referido cálculo do caso de teste.
 
 SAÍDA
 Para cada caso de teste de entrada do seu programa, imprima a expressão “Errou!”, 
 baseada na distância da resposta do participante em relação à resposta correta.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2868 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int C = leitor.nextInt();
    	for (int i = 0; i < C; i++) {
    		int n1 = leitor.nextInt();
    		char op = leitor.next().charAt(0);
    		int n2 = leitor.nextInt();
    		char ignore = leitor.next().charAt(0);
    		int respostaDada = leitor.nextInt();
    		int resposta = 0;
    		if (op == '+') {
        		resposta = Math.abs(respostaDada - (n1 + n2));
    		} else if (op == '-') {
        		resposta = Math.abs(respostaDada - (n1 - n2));
    		} else {
        		resposta = Math.abs(respostaDada - (n1 * n2));
    		}
    		StringBuilder faustao = new StringBuilder("E");
    		for (int j = 0; j < resposta; j++) {
    			faustao.append('r');
    		}
    		faustao.append("ou!");
    		System.out.println(faustao);
    	}
    }
    
}