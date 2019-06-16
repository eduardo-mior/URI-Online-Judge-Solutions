package Iniciante;

/*
 
 QUESTÃO
 Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. 
 Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa 
 forma voarem mais alto, elas devem possuir um barbante bem esticado ligando 
 todos os pares de pontas não vizinhas.

 Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe 
 como determinar a quantidade de barbantes que ele terá que utilizar para 
 tornar  uma pipa de n lados, estável. Você pode ajudá-lo?.
 
 ENTRADA
 A entrada será composta por uma única linha, que contém um inteiro 
 3 <= n <= 10^5, representando o número de lados da pipa.
 
 SAÍDA
 Imprima um número inteiro, que será a quantidade de barbantes que Guilherme 
 terá que utilizar para tornar a pipa de n lados estável.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1921 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		long N = leitor.nextLong();
		long resposta = (N * (N - 3)) / 2;
		System.out.println(resposta);
    }
	
}