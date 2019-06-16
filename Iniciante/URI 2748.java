package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria de fazer uma tela com as seguintes características:

 1. Ter 39 traços (-) na primeira linha;
 2. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 
    10 traço deve começar a escrever a palavra "Roberto" e o restante preencher no meio com espaço em branco;
 3. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher 
    no meio com espaço em branco;
 4. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 
    10 traço deve começar a escrever o número "5786" e o restante preencher no meio com espaço em branco;
 5. Repita o procedimento 3;
 6. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 
    10 traço deve começar a escrever a palavra "UNIFEI" e o restante preencher no meio com espaço em branco;
 7. Repita o procedimento 1.

 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 traços)
 |        Roberto                      |
 |                                     |
 |        5786                         |
 |                                     |
 |        UNIFEI                       |
 --------------------------------------- (39 traços)
 
 ENTRADA
 Não há.
 
 SAÍDA
 A saída será impresso conforme a figura acima.

*/

import java.io.IOException;

public class URI 2748 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        	for (int j = 1; j <= 39; j++) {
        		
        		if (i == 1 || i == 7)
        			System.out.print("-");
        		
        		else if (j == 1 || j == 39)
        			System.out.print("|");
        		
        		else if (i == 2) {
        			if (j == 10)
        				System.out.print("Roberto");
        			else if (j < 10 || j > 16)
        				System.out.print(" ");
        		}
        		
        		else if (i == 4) {
        			if (j == 10) 
        				System.out.print("5786");
        			else if (j < 10 || j > 13)
        				System.out.print(" ");
        		}
        		
        		else if (i == 6) {
        			if (j == 10)
        				System.out.print("UNIFEI");
        			else if (j < 10 || j > 15)
        				System.out.print(" ");
        		}
        		
        		else 
        			System.out.print(" ");
        		
        	}
        	System.out.print("\n");
        }
    }
	
}