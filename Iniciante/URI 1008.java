package Iniciante;

/*

 QUESTÃO
 Escreva um programa que leia o número de um funcionário, seu número de 
 horas trabalhadas, o valor que recebe por hora e calcula o salário 
 desse funcionário. A seguir, mostre o número e o salário do funcionário, 
 com duas casas decimais.

 ENTRADA
 O arquivo de entrada contém 2 números inteiros e 1 número com duas casas 
 decimais, representando o número, quantidade de horas trabalhadas e o valor 
 que o funcionário recebe por hora trabalhada, respectivamente.

 SAÍDA
 Imprima o número e o salário do funcionário, conforme exemplo fornecido, 
 com um espaço em branco antes e depois da igualdade. No caso do salário, 
 também deve haver um espaço em branco após o $.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1008 {
	
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int funcionarios = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
	
}