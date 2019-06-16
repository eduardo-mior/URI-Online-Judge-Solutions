package Iniciante;

/*
 
 QUESTÃO
 Amarelinha provavelmente é a brincadeira em que as crianças da vila mais se 
 divertem, porém a mesma vem causando um bom tempo de discussão e choro nas 
 crianças que a praticam. A causa do transtorno é para decidir quem será o 
 próximo a pular, mas recentemente Quico (O gênio!) teve uma grande ideia 
 para solucionar o problema. Basicamente a brincadeira só poderá ser jogada 
 de dois em dois jogadores e para escolher o próximo jogador Quico indicou o 
 uso do tradicional método par ou ímpar, onde os dois jogadores informam um 
 número e se a soma desses números for par o jogador que escolheu PAR ganha 
 ou vice verso. Entretanto a utilização desse método vem deixando o Quico 
 louco, louco, louco... E por esse motivo ele pediu a sua ajuda! Solicitou a 
 você um programa que dado o nome dos jogadores, suas respectivas escolhas 
 PAR ou IMPAR e os números, informe quem foi o vencedor.
 
 ENTRADA
 A primeira linha de entrada contém um número inteiro QT (1 <= QT <= 100), 
 indicando a quantidade de casos de teste que vem a seguir. Cada caso de teste 
 contém duas linhas. Na primeira linha será informado o nome do jogador 1 
 seguido de sua escolha, “PAR” ou “IMPAR” e logo após, o nome do jogador 2 
 seguido de sua escolha, “PAR” ou “IMPAR”. Na segunda linha de entrada, contém 
 2 números inteiros N (1 <= N <= 10^9) e M (1 <= M <= 10^9), representando 
 respectivamente os números escolhidos pelo jogador 1 e pelo jogador 2. É 
 garantido que a escolha (PAR ou IMPAR) do jogador 1 será diferente da escolha 
 (PAR ou IMPAR) do jogador 2 e que o nome dos jogares são formados somente por 
 letras e não ultrapassarão 100 caracteres.
 
 SAÍDA
 Para cada caso de teste, imprima uma única linha contendo o nome do jogador vencedor.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI 1914 {
	
    public static void main(String[] args) throws IOException {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int QT = Integer.parseInt(leitor.readLine());
		String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
		int N, M;
		for (int i = 0; i < QT; i++) {
			linha1 = leitor.readLine().split(" ");
			linha2 = leitor.readLine().split(" ");
			N = Integer.parseInt(linha2[0]);
			M = Integer.parseInt(linha2[1]);
			nome1 = linha1[0];
			escolha1 = linha1[1];
			nome2 = linha1[2];
			escolha2 = linha1[3];
			
			if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
			    ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(nome1);
			else System.out.println(nome2);
		}
    }
	
}