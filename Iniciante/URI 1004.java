package Iniciante;

/*

 QUESTÃO
 Leia dois valores inteiros. A seguir, calcule o produto entre estes 
 dois valores e atribua esta operação à variável PROD. A seguir mostre 
 a variável PROD com mensagem correspondente.   

 ENTRADA
 O arquivo de entrada contém 2 valores inteiros.

 SAÍDA
 Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco
 antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o 
 produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1004 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
	
}