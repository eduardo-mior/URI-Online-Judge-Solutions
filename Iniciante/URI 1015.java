package Iniciante;

/*

 QUESTÃO
 Leia os quatro valores correspondentes aos eixos x e y de dois pontos 
 quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
 mostrando 4 casas decimais após a vírgula, segundo a fórmula: http://prntscr.com/jvxvhv

 ENTRADA
 O arquivo de entrada contém duas linhas de dados. A primeira linha contém 
 dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores 
 de ponto flutuante x2 y2.

 SAÍDA
 Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1015 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(String.format("%.4f", distancia)); 
    }
	
}