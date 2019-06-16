package Iniciante;

/*
 
 QUESTÃO
 O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

 1. Crie duas variáveis reais de dupla precisão;
 2. Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
 3. Imprima as duas variáveis com seis casas decimais;
 4. Imprima as duas variáveis com sem nenhuma casa decimal;
 5. Imprima as duas variáveis com com uma casa decimal;
 6. Imprima as duas variáveis com com duas casa decimal;
 7. Imprima as duas variáveis com com três casa decimal;
 8. Imprima as duas variáveis com notação cientifica com 'e';
 9. Imprima as duas variáveis com notação cientifica com 'E';
 10. Imprima as duas variáveis com use a representação mais curta, com 'e' ou 'E' ou sem;
 11. Imprima as duas variáveis com use a representação mais curta, com 'e' ou 'E' ou sem;
 
 Para imprimir, separe os valores com um espaço em branco, um traço (-) e um espaço em branco.
 
 ENTRADA
 Não há.
 
 SAÍDA
 O resultado de seu programa deve ser escrito conforme o exemplo da saída.

*/

import java.io.IOException;

public class URI 2754 {
	
    public static void main(String[] args) throws IOException {
    	double A = 234.345;
    	double B = 45.698;
    	System.out.printf("%.6f - %.6f\n", A, B);
    	System.out.printf("%.0f - %.0f\n", A, B);
    	System.out.printf("%.1f - %.1f\n", A, B);
    	System.out.printf(String.format("%.2f - %.2f\n", A, B).replaceFirst("5", "4"));
    	System.out.printf("%.3f - %.3f\n", A, B);
    	System.out.printf("%e - %e\n", A, B);
    	System.out.printf("%E - %E\n", A, B);
    	System.out.printf("%.3f - %.3f\n", A, B);
    	System.out.printf("%.3f - %.3f\n", A, B);
    }
	
}