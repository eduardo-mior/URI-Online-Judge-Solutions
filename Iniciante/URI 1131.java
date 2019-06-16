package Iniciante;

/*
 
 QUESTÃO
 A Federação Gaúcha de Futebol contratou você para escrever um programa para 
 fazer uma estatística do resultado de vários GRENAIS. Escreva um programa 
 para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
 Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma 
 resposta. Se a resposta for 1, o algoritmo deve ser executado novamente 
 solicitando o número de gols marcados pelos times em uma nova partida, caso 
 contrário deve ser encerrado imprimindo:

 - Quantos GRENAIS fizeram parte da estatística.
 - O número de vitórias do Inter.
 - O número de vitórias do Grêmio.
 - O número de Empates.
 - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS 
  (ou "Nao houve vencedor", caso termine empatado).

 ENTRADA
 O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados 
 pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), 
 correspondente à repetição do programa.
 
 SAÍDA
 Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
 Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a 
 descrição apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, 
 conforme o exemplo abaixo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1131 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int golsInter;
		int golsGremio;
		int flag = 1;
		int totalJogos = 0;
		int vitoriasGremio = 0;
		int vitoriasInter = 0;
		int empates = 0;
		
		while (flag == 1) {
			totalJogos++;
			golsInter = leitor.nextInt();
			golsGremio = leitor.nextInt();
			if (golsInter > golsGremio) vitoriasInter++;
			else if (golsGremio > golsInter) vitoriasGremio++;
			else empates++;
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			flag = leitor.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				flag = leitor.nextInt();
			}
		}
		
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		if (vitoriasInter > vitoriasGremio) System.out.println("Inter venceu mais");
		else if (vitoriasGremio > vitoriasInter) System.out.println("Gremio venceu mais");
		else System.out.println("Nao houve vencedor");
    }
	
}