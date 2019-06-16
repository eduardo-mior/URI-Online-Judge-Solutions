package Iniciante;

/*
 
 QUESTÃO
 Ultimamente, diversas pessoas estão indo à Dra. Cláudia Café com Leite para 
 saber se estão consumindo a quantidade recomendada diária de vitamina C. 
 Isso tem a deixado exausta, e por isso ela lhe pediu para escrever um programa 
 que, dado o consumo diário de alimentos ricos em vitamina C por uma pessoa, 
 indique o quanto essa pessoa deve consumir a mais ou a menos para atingir o recomendado.

 Para tal, você poderá utilizar a tabela a seguir:

 Alimentos ricos em Vitamina C	Quantidade de Vitamina C
   		suco de laranja  				120 mg
   		morango fresco	 				85 mg
   		mamao							85 mg
 		goiaba vermelha 		 		70 mg
 		manga	          	 			56 mg
 		laranja         	  	 		50 mg
 		brocolis        		  		34 mg
 		
 Considere que o consumo diário recomendado de vitamina C está entre 110 mg e 130 mg, inclusive.
 
 ENTRADA
 Cada caso de teste é composto um inteiro T (1 <= T <= 7) indicando que a pessoa 
 consome diariamente T alimentos entre os 7 alimentos da tabela. Em seguida, 
 haverá T linhas com um inteiro N e um alimento (totalmente em caixa baixa e 
 sem acentuações), indicando que a pessoa consome uma quantidade N daquele 
 alimento. A entrada termina com T = 0.

 SÁIDA
 Para cada caso de teste (T), se o consumo ultrapassou o limite recomendado, 
 imprima "Menos X mg", em que X representa a quantidade a menos a ser consumida 
 para atingir o limite recomendado; se o consumo não atingiu o recomendado, 
 imprima "Mais X mg", em que X representa a quantidade a mais para atingir o 
 recomendado; se o consumo está dentro do intervalo recomendado, imprima "X mg", 
 em que X representa a quantidade consumida diariamente pela pessoa.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2486 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		while (T != 0) {
			int totalVitaminaC = 0;
			for (int i = 0; i < T; i++) {
				int quantia = leitor.nextInt();
				String nomeAlimento = leitor.nextLine().replace(" ", "");
				Alimento alimento = Alimento.valueOf(nomeAlimento);
				totalVitaminaC += alimento.vitaminaC * quantia;
			}

			if (totalVitaminaC < 110) {
				System.out.println("Mais " + (110 - totalVitaminaC) + " mg");
			} else if (totalVitaminaC > 130) {
				System.out.println("Menos " + (totalVitaminaC - 130) + " mg");
			} else {
				System.out.println(totalVitaminaC + " mg");
			}

			T = leitor.nextInt();
		}
	}

	enum Alimento {

		sucodelaranja(120),
		morangofresco(85),
		mamao(85),
		goiabavermelha(70),
		manga(56),
		laranja(50),
		brocolis(34);

		private int vitaminaC;

		Alimento(int vitaminaC) {
			this.vitaminaC = vitaminaC;
		}
	}
	
}