package Iniciante;

/*
 
 QUESTÃO
 Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 Efetue a soma de A e B atribuindo o seu resultado na variável X. 
 Imprima X conforme exemplo apresentado abaixo. Não apresente 
 mensagem alguma além daquilo que está sendo especificado.

 ENTRADA
 A entrada contém 2 valores inteiros.
 
 SAÍDA
 Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor 
 da variável X e pelo final de linha. Cuide para que tenha um espaço 
 antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1001 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
    }
	
}