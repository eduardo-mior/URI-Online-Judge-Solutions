package Iniciante;

/*
 
 QUESTÃO
 O seu professor gostaria de fazer um programa com as seguintes características:

 1. Crie duas variáveis para armazenar números reais de precisão simples;
 2. Crie duas variáveis para armazenar números reais de precisão dupla;
 3. Leia o primeiro número de precisão simples que sempre terá uma casa decimal;
 4. Leia o segundo número de precisão simples que sempre terá duas casas decimais;
 5. Leia o primeiro número de precisão dupla que sempre terá três casas decimais;
 6. Leia o segundo número de precisão dupla que sempre terá quatro casas decimais;
 7. Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco, o 
    número armazenado na primeira variável lida no passo 3, uma virgula, um espaço em branco, 
    a letra B, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado 
    na segunda variável lida no passo 4. Não esqueça de pular linha;
 8. Imprima a letra C, um espaço em branco, o sinal de igual, um espaço em branco, o número 
    armazenado na primeira variável lida no passo 5, uma virgula, um espaço em branco, a letra 
    D, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado na segunda 
    variável lida no passo 6. Não esqueça de pular linha;
 9. Repita o procedimento 7, imprimindo os números com uma casa decimal;
 10. Repita o procedimento 8, imprimindo os números com uma casa decimal;
 11. Repita o procedimento 7, imprimindo os números com duas casas decimais;
 12. Repita o procedimento 8, imprimindo os números com duas casas decimais;
 13. Repita o procedimento 7, imprimindo os números com três casas decimais;
 14. Repita o procedimento 8, imprimindo os números com três casas decimais;
 15. Repita o procedimento 7, imprimindo os números com três casas decimais e em forma de 
     notação cientifica com o carácter E;
 16. Repita o procedimento 8, imprimindo os números com três casas decimais e em forma de 
     notação cientifica com o carácter E;
 17. Repita o procedimento 7, imprimindo somente a parte inteira do número;
 18. Repita o procedimento 8, imprimindo somente a parte inteira do número.
 
 ENTRADA
 A entrada consiste em vários arquivos de teste. Em cada arquivo de teste tem duas linhas. 
 Na primeira linha tem dois números reais A e B (-1000.0 <= A, B <= 1000.0), separados por 
 espaço em branco. Na segunda linha tem dois números reais C e D (-1000.0 <= C, D <= 1000.0), 
 separados por espaço em branco. Conforme mostrado no exemplo de entrada a seguir.
 
 SAÍDA
 Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem doze 
 linhas da forma descrita no item 7 e 8. Conforme mostra o exemplo de saída a seguir.

*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI 2758 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("");
		float A = leitor.nextFloat();
		float B = leitor.nextFloat();
		double C = leitor.nextDouble();
		double D = leitor.nextDouble();

		df = new DecimalFormat("0.000000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.00");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000E00");
		if (!df.format(A).contains("E-"))
			System.out.print("A = " + df.format(A).replace("E", "E+"));
		else
			System.out.print("A = " + df.format(A));
		if (!df.format(B).contains("E-"))
			System.out.println(", B = " + df.format(B).replace("E", "E+"));
		else
			System.out.println(", B = " + df.format(B));

		if (!df.format(C).contains("E-"))
			System.out.print("C = " + df.format(C).replace("E", "E+"));
		else
			System.out.print("C = " + df.format(C));
		if (!df.format(D).contains("E-"))
			System.out.println(", D = " + df.format(D).replace("E", "E+"));
		else
			System.out.println(", D = " + df.format(D));

		df = new DecimalFormat("0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));
	}
	
}