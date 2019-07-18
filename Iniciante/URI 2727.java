package Iniciante;

/*
 
 QUESTÃO
 Joana gosta de brincar de fingir ser uma agente secreta com suas amigas Bruna, 
 Jaqueline e Laura. Joana e Bruna criaram um código secreto para se comunicar 
 sem que suas inimigas descubram seus planos.
 O código secreto funciona da seguinte forma:

   • A letra 'a' é representada por um único ponto '.'
   • A letra 'b' é representada por dois pontos '..'
   • A letra 'c' é representada por três pontos '...'
   • As demais letras seguem a lógica anterior, porém cada conjunto de pontos 
   está separado por um espaço e sempre com um conjunto a mais de pontos, como no 
   exemplo abaixo:
		. -> a
		.. -> b
		
		... -> c
		
		. . -> d
		
		.. .. -> e
		... ... -> f
		
		. . . -> g
		.. .. .. -> h
		... ... ... -> i

 O seu objetivo é criar um programa que decifre as mensagens secretas e ajudar 
 Jaqueline e Laura descobrirem o que Joana e Bruna estão planjando.
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada teste deverá 
 conter um inteiro (N <= 50), que representa a quantidade de letras a serem decifradas 
 e as N linhas seguintes contêm o código de cada letra.
 
 SAÍDA
 Uma string representando a letra do alfabeto correspondente ao código de entrada. 
 Cada string deve estar separada da outra por uma nova linha.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2727 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int N = leitor.nextInt();
    		for (int i = 0; i < N; i++) {
    			String[] codigo = readLine(leitor).split(" ");
    			char letra = (char) (96 + (((codigo.length - 1) * 3) + codigo[0].length()));
    			System.out.println(letra);
    		}
    	}
    }
    
    public static String readLine(Scanner leitor) {
    	String line = leitor.nextLine();
    	while (line.isEmpty())
    		line = leitor.nextLine();
    	return line;
    }
    
}