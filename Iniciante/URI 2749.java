package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria de fazer uma tela com as seguintes características:

 1. Ter 39 traços (-) na primeira linha;
 2. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 2o traço deve começar a escrever "x = 35" e o restante preencher com espaço em branco;
 3. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
 4. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 17o traço deve começar a escrever "x = 35" e o restante preencher com espaço em branco;
 5. Repita o procedimento 3;
 6. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 33o traço deve começar a escrever "x = 35" e o restante preencher no meio com espaço em branco;
 7. Repita o procedimento 1.

 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 traços)
 |x = 35                               |
 |                                     |
 |               x = 35                |
 |                                     |
 |                               x = 35|
 --------------------------------------- (39 traços)
 
 ENTRADA
 Não há.
 
 SAÍDA
 A saída será impresso conforme a figura acima.

*/

import java.io.IOException;

public class URI 2749 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        	for (int j = 1; j <= 39; j++) {
        		
        		if (i == 1 || i == 7)
        			System.out.print("-");
        		
        		else if (j == 1 || j == 39)
        			System.out.print("|");
        		
        		else if (i == 2) {
        			if (j == 2)
        				System.out.print("x = 35");
        			else if (j > 7)
        				System.out.print(" ");
        		}
        		
        		else if (i == 4) {
        			if (j == 17) 
        				System.out.print("x = 35");
        			else if (j < 17 || j > 22)
        				System.out.print(" ");
        		}
        		
        		else if (i == 6) {
        			if (j == 33)
        				System.out.print("x = 35");
        			else if (j < 33)
        				System.out.print(" ");
        		}
        		
        		else 
        			System.out.print(" ");
        		
        	}
        	System.out.print("\n");
        }
    }
	
}