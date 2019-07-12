package Iniciante;

/*

 QUESTÃO
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
 diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
 DIFERENCA = (A * B - C * D).

 ENTRADA
 O arquivo de entrada contém 4 valores inteiros.

 SAÍDA
 Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme 
 exemplo abaixo, com um espaço em branco antes e depois da igualdade.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1007 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("DIFERENCA = " + diferenca);
    }
	
}