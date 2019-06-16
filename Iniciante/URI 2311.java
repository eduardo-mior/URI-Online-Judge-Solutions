package Iniciante;

/*
 
 QUESTÃO
 Em uma determinada competição de saltos ornamentais, cada salto recebe um 
 grau de dificuldade e é avaliado por sete juízes. Após cada salto, os 
 juízes, que não se comunicam uns com os outros, mostram suas notas. Um salto 
 é cotado entre zero e dez pontos. Depois de apresentadas as notas, a mais 
 alta e a mais baixa são descartadas. O restante é somado e multiplicado pelo 
 grau de dificuldade do salto, que gira entre 1,2 e 3,8, definido sempre antes 
 do início da apresentação do atleta. O julgamento então é feito da seguinte 
 forma: supondo que um saltador tenha sua nota de partida (seu grau de  dificuldade 
 de movimento) avaliada em 2,0 e tire notas 6,0, 5,0, 5,0, 5,0, 5,0, 5,0, 4,0 em 
 sua execução. Disso, retira-se a nota mais baixa e a mais alta, o que gera um 
 resultado parcial de 25,0. Então, pega-se a nota de execução e multiplica-a 
 pela nota de partida para se chegar ao resultado final, que neste exemplo é de 
 50,0. Seu programa deve apresentar o resultado de uma competição de acordo com estas regras.
 
 ENTRADA
 A primeira linha de entrada contém o número de competidoresN (0 <= N <= 100). 
 A seguir são mostrados os nomes de cada um dos competidores seguidos pelo 
 grau de dificuldade dos seus saltos GD (1.2 <= GD <= 3.8) e, a seguir, na linha 
 seguinte, as 7 notas recebidas N1 a N7 (0 <= N1 a N7 <= 10).

 SÁIDA
 A saída deve apresentar o resultado da competição, com o nome dos competidores 
 seguido de seu resultado, na ordem em que os dados foram lidos. 

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2311 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String nome = leitor.next();
			double dificuldade = leitor.nextDouble();
			double[] notas = new double[7];
			for (int j = 0; j < notas.length; j++) {
				notas[j] = leitor.nextDouble();
			}
			zerarNotaMaisBaixa(notas);
			zerarNotaMaisAlta(notas);
			double notaFinal = calcularNotaFinal(notas, dificuldade);
			System.out.println(String.format("%s %.2f", nome, notaFinal));
		}
	}
	
	private static void zerarNotaMaisBaixa(double[] notas) {
		int indice = 0;
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < notas[indice]) indice = i;
		}
		notas[indice] = 0.0;
	}
	
	private static void zerarNotaMaisAlta(double[] notas) {
		int indice = 0;
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > notas[indice]) indice = i;
		}
		notas[indice] = 0.0;
	}
	
	private static double calcularNotaFinal(double[] notas, double dificuldade) {
		double soma = 0.0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return (soma * dificuldade);
	}
	
}