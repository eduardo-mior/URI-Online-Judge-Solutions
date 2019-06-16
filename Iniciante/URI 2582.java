package Iniciante;

/*
 
 QUESTÃO
 System of a Download é uma famosa banda de Hacker Metal! Certa vez, eles 
 criaram um dispositivo, com seis botões, numerados de 0 a 5, e colocaram 
 nesse dispositivo os seus 11 maiores sucessos. Para tocar uma destas músicas, 
 é preciso pressionar dois botões. Com isso, os números destes dois botões são 
 somados, e então toca-se a música correspondente ao número da soma, conforme 
 a relação abaixo:

 0 - PROXYCITY
 1 - P.Y.N.G.
 2 - DNSUEY!
 3 - SERVERS
 4 - HOST!
 5 - CRIPTONIZE
 6 - OFFLINE DAY
 7 - SALT
 8 - ANSWER!
 9 - RAR?
 10 - WIFI ANTENNAS

 Por exemplo, se os botões pressionados forem 3 e 4, irá tocar a música 7 - SALT
 Escreva um programa que, dados os dois botões que forem pressionados, determine 
 qual música irá tocar.
  
 ENTRADA
 Um número inteiro C será informado, que será a quantidade de casos de teste. 
 Cada caso tem dois valores inteiros, X e Y, representando quais botões foram 
 pressionados.
 
 SAÍDA
 Para cada caso de teste, imprima o nome da música correspondente.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2582 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		for (int i = 0; i < C; i++) {
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			Musica music = Musica.valueOf("_"  + (X + Y));
			System.out.println(music.nome);
		}
	}

	enum Musica {
		_0("PROXYCITY"),
		_1("P.Y.N.G."),
		_2("DNSUEY!"),
		_3("SERVERS"),
		_4("HOST!"),
		_5("CRIPTONIZE"),
		_6("OFFLINE DAY"),
		_7("SALT"),
		_8("ANSWER!"),
		_9("RAR?"),
		_10("WIFI ANTENNAS");

		private String nome;
		
		Musica (String nome) {
			this.nome = nome;
		}
	}
	
}