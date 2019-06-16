package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

 1. Crie duas variáveis inteiras a e b e duas variáveis reais de simples precisão c e d;
 2. Atribua a variável a o valor 15 e atribua a variável b o valor de a dividido por 2;
 3. Atribua a variável c o valor 15.456 e atribua a variável d o valor de c dividido por 7;
 4. Mostre na primeira linha a frase: "Valores de b:";
 5. Mostre na linha seguinte a mesma quantidade de carácter da frase "Valores de b:", só que com traço (-);
 6. Mostre na linha seguinte a frase "1) b = ", e o valor da variável b;
 7. Mostre na linha seguinte a frase "2) b = ", e o valor da variável b usando 20 espaço e justificado à direita;
 8. Mostre na linha seguinte a frase "3) b = ", e o valor da variável b usando 20 espaço preenchidos com 0;
 9. Mostre na linha seguinte a frase "4) b = ", e o valor da variável b usando 20 espaço e justificado à esquerda;
 10. Mostre na linha seguinte a frase "5) b = ", e o valor da variável b seguido do carácter '%';
 11. Pule uma linha;
 12. Mostre na linha seguinte a frase: "Valores de d:";
 13. Mostre na linha seguinte a mesma quantidade de carácter da frase "Valores de d:", só que com traço (-);
 14. Mostre na linha seguinte a frase "1) d = ", e o valor da variável d;
 15. Mostre na linha seguinte a frase "2) d = ", e o valor da variável d somente com sua parte inteira;
 16. Mostre na linha seguinte a frase "3) d = ", e o valor da variável d com uma casa decimal;
 17. Mostre na linha seguinte a frase "4) d = ", e o valor da variável d com duas casas decimais;
 18. Mostre na linha seguinte a frase "5) d = ", e o valor da variável d com três casas decimais;
 19. Mostre na linha seguinte a frase "6) d = ", e o valor da variável d com três casas decimais 
     e colocados em 20 espaço;
 20. Mostre na linha seguinte a frase "7) d = ", e o valor da variável d com três casas decimais 
     e colocados em 20 espaço com 0 nos espaço em branco;
 21. Repita o procedimento 19 com justificativa à esquerda;
 22. Mostre na linha seguinte a frase "9) d = ", e o valor da variável d com duas casas decimais 
     seguido do carácter '%'.
 
 ENTRADA
 Não há.
 
 SAÍDA
 O resultado de seu programa deve ser escrito conforme o exemplo de saída.

*/

import java.io.IOException;

public class URI 2751 {
	
    public static void main(String[] args) throws IOException {
    	final int a = 15;
    	final int b = a / 2;
    	final float c = 15.456f;
    	final float d = c / 7;
    	System.out.print("Valores de b:");
    	print("Valores de b:");
    	System.out.printf("1) b = %d\n", b);
    	System.out.printf("2) b = %20d\n", b);
    	System.out.printf("3) b = %020d\n", b);
    	System.out.printf("4) b = %-20d\n", b);
    	System.out.printf("5) b = %d%%\n", b);
    	System.out.print("\nValores de d:");
    	print("Valores de d:");
    	System.out.printf("1) d = %f\n", d);
    	System.out.printf("2) d = %.0f\n", d);
    	System.out.printf("3) d = %.1f\n", d);
    	System.out.printf("4) d = %.2f\n", d);
    	System.out.printf("5) d = %.3f\n", d);
    	System.out.printf("6) d = %20.3f\n", d);
    	System.out.printf("7) d = %020.3f\n", d);
    	System.out.printf("8) d = %-20.3f\n", d);
    	System.out.printf("9) d = %.2f%%\n", d);
    }
    
    private static void print(String s) {
    	System.out.print("\n");
    	for (int i = 0; i < s.length(); i++)
    		System.out.print("-");
    	System.out.print("\n");
    }
	
}