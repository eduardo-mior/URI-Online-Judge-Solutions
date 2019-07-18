package Iniciante;

/*

 QUESTÃO
 Faça um programa que calcule e mostre o volume de uma esfera sendo 
 fornecido o valor de seu raio (R). A fórmula para calcular o volume 
 é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

 Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois 
 algumas linguagens (dentre elas o C++), assumem que o resultado da 
 divisão entre dois inteiros é outro inteiro.

 ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), 
 correspondente ao raio da esfera.

 SAÍDA
 A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido 
 abaixo, com um espaço antes e um espaço depois da igualdade. O valor 
 deverá ser apresentado com 3 casas após o ponto.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1011 {
	
	public static final pi = 3.14159;
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
	
}