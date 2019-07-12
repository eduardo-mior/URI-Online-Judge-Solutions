package Iniciante;

/*

 QUESTÃO
 A fórmula para calcular a área de uma circunferência é: area = pi . raio2. 
 Considerando para este problema que pi = 3.14159:

 - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi.

 ENTRADA
 A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

 SAÍDA
 Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme 
 exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de 
 dupla precisão (double). Como todos os problemas, não esqueça de imprimir 
 o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1002 {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double raio = leitor.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area)); 
	}
	
}