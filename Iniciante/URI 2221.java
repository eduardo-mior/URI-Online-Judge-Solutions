package Iniciante;

/*
 
 QUESTÃO
 Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. 
 A forma de duelo é simples, cada treinador coloca um Pomekon na batalha e 
 vence quem tem o Pomekon com maior valor de golpe, que é definido da 
 seguinte maneira: http://prntscr.com/ka77vm

 O Bônus será dado ao Pomekon do treinador que estiver em um level de valor par.

 Neste problema será dado a você o valor do bônus aplicado, os valores de 
 ataque e defesa do Pomekon de Dabriel e Guarte e seus respectivos níveis, 
 cabe a você informar o ganhador da batalha.
  
 ENTRADA
 A entrada é composta por diversas instâncias. A primeira linha da entrada contém 
 um inteiro T indicando o número de instâncias. Cada instância começa com um 
 inteiro B (0 <= B <= 100), que indica o valor do bônus aplicado. Nas duas linhas 
 seguintes terão três inteiros Ai, Di e Li (1 <= Ai, Di <= 100, 1 <= Li <= 50), 
 representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. 
 A primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.
 
 SAÍDA
 Para instância na entrada você deverá imprimir o nome do treinador que irá vencer 
 a batalha, em caso de empate imprima: "Empate", sem aspas. 
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2221 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = leitor.nextInt();
    		A1 = leitor.nextInt();
    		D1 = leitor.nextInt();
    		L1 = leitor.nextInt();
    		A2 = leitor.nextInt();
    		D2 = leitor.nextInt();
    		L2 = leitor.nextInt();
    		V1 = ((A1 + D1) / 2) + (L1 % 2 == 0 ? B : 0);
    		V2 = ((A2 + D2) / 2) + (L2 % 2 == 0 ? B : 0);
    		if (V1 > V2) System.out.println("Dabriel");
    		else if (V2 > V1) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}
    }
	
}