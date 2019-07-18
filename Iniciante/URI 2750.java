package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

 1. Criar 16 variáveis inteiras;
 2. Atribuir a elas valores de 0 a 15 a cada um das variáveis anteriores;
 3. Ter 39 traços (-) na primeira linha;
 4. Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço 
    da primeira linha, embaixo do 4o traço deve começar a escrever “decimal”, embaixo do 16o traço deve 
    começar a escrever “octal”, embaixo do 26o traço deve começar a escrever “Hexadecimal” e o restante 
    preencher com espaço em branco;
 5. Repita o procedimento 1;
 6. Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da 
    primeira linha, embaixo do 8o traço deve imprimir o valor da primeira variável em valor decimal, embaixo 
    do 18o traço deve imprimir o valor da primeira variável em valor octal, embaixo do 31o traço deve 
    imprimir o valor da primeira variável em valor hexadecimal e o restante preencher com espaço em branco;
 7. Repita o procedimento 6 para as outras 15 variáveis;
 8. Repita o procedimento 1.

 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 traços)
 | decimal   |  octal  |  Hexadecimal  |
 ---------------------------------------
 |      0    |    0    |       0       |
 |      1    |    1    |       1       |
 |      2    |    2    |       2       |
 |      3    |    3    |       3       |
 |      4    |    4    |       4       |
 |      5    |    5    |       5       |
 |      6    |    6    |       6       |
 |      7    |    7    |       7       |
 |      8    |   10    |       8       |
 |      9    |   11    |       9       |
 |     10    |   12    |       A       |
 |     11    |   13    |       B       |
 |     12    |   14    |       C       |
 |     13    |   15    |       D       |
 |     14    |   16    |       E       |
 |     15    |   17    |       F       |
 --------------------------------------- (39 traços)

 ENTRADA
 Não há.
 
 SAÍDA
 A saída será impressa conforme a figura acima.

*/

import java.io.IOException;

public class URI 2750 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 20; i++) {
        	for (int j = 1; j <= 39; j++) {
        		
        		if (i == 1 || i == 20 || i == 3)
        			System.out.print("-");
        		
        		else if (j == 1  || j == 13 || j == 23 || j == 39)
        			System.out.print("|");
        		
        		else if (i == 2) {
        			if (j == 4)
        				System.out.print("decimal");
        			else if (j == 16)
        				System.out.print("octal");
        			else if (j == 26)
        				System.out.print("Hexadecimal");
        			else if (j < 4 || j > 36 || (j > 10 && j < 18) || (j > 21 && j <26))
        				System.out.print(" ");
        		}
        		
        		else {
        			if (j == 8)
        				System.out.print(Integer.toString(i - 4));
        			else if (j == 18)
        				System.out.print(Integer.toOctalString(i - 4));
        			else if (j == 31)
        				System.out.print(Integer.toHexString(i - 4).toUpperCase());
        			else if (!(i > 11 && j == 14) && !(i > 13 && j == 2))
        				System.out.print(" ");
        		}
        		
        	}
        	System.out.print("\n");
        }
    }
	
}