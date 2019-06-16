package Iniciante;

/*
 
 QUESTÃO
 Sr PI é um construtor muito famoso na cidade de Programolândia. Ele precisa 
 de sua ajuda para encontrar os melhores terrenos da cidade, para realizar 
 assim a construção de vários projetos de casas que possui.

 Considere que ele tenha por exemplo, um projeto para construir uma casa de 8 
 metros por 10 metros, e a legislação do município permite a construção de no 
 máximo 100% do terreno. Como todos os terrenos nesta cidade são perfeitamente 
 quadrados e o valor dos lados da casa são apenas uma referência para a área 
 total a ser construída (80 metros quadrados), o sr PI precisaria de um terreno 
 de 8.994 metros, o que simplificado daria como resultado 8 metros e o tamanho 
 real da casa seria de 64 metros quadrados. Se a legislação permitisse a utilizar 
 50% do terreno, o mesmo teria que ter 160 metros para que 50% dele fosse 80 
 metros quadrados, o suficiente para uma casa de 8 x 8 metros (64 metros quadrados).
 No primeiro caso de teste, como o percentual para construir é de apenas 20%, o 
 terreno teria que ter 20 metros de lado para que 1/5 deste terreno tivesse o 
 tamanho de 80 metros quadrados. Ajude o sr PI a determinar o tamanho minimo do terreno.
  
 ENTRADA
 A entrada é composta de vários casos de testes. Cada caso de teste é composto de três 
 números inteiros A, B e C ( > 0 e <= 1000) separados por um espaço. Estes números 
 representam as medidas da casa (A e B) e o percentual máximo liberado para construir 
 nesse bairro (C). Um único valor igual a 0 indica o fim das entradas.
 
 SAÍDA
 Você deverá informar um número inteiro, o qual representa a medida do lado do terreno. 
 Este valor deverá ser truncado caso necessário.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1541 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A, B, C, X;
        while ((A = leitor.nextInt()) != 0) {
        	B = leitor.nextInt();
        	C = leitor.nextInt();
        	X = Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)X);
        }
    }
	
}