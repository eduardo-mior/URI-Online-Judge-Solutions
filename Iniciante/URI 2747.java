package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria de fazer uma tela com as seguintes características:

 1. Ter 39 traços (-) na primeira linha;
 2. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher 
    no meio com espaço em branco;
 3. Repita o procedimento 2 mais quatro vezes;
 4. Repita o procedimento 1.
 
 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 traços)
 |                                     |
 |                                     |
 |                                     |
 |                                     |
 |                                     |
 --------------------------------------- (39 traços)
 
 ENTRADA
 Não há.
 
 SAÍDA
 A saída será impresso conforme a figura acima.

*/

import java.io.IOException;

public class URI 2747 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        	for (int j = 1; j <= 39; j++) {
        		if (i == 1 || i == 7)
        			System.out.print("-");
        		else if (j == 1 || j == 39)
        			System.out.print("|");
        		else 
        			System.out.print(" ");
        	}
        	System.out.print("\n");
        }
    }
	
}