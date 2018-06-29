package Iniciante;

/*

 QUESTÃO
 Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C 
 e se D for maior do que A, e a soma de C com D for maior que a soma 
 de A e B e se C e D, ambos, forem positivos e se a variável A for par 
 escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

 ENTRADA
 Quatro números inteiros A, B, C e D.

 SAÍDA
 Mostre a respectiva mensagem após a validação dos valores.

*/

import java.io.IOException;
import java.util.Scanner;

public class problema1035 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
        boolean aceitar = true;
        
        if ((B > C) && (D > A) && ((C+D) > (A+B)) && (C > 0) && (D > 0) && (A % 2 == 0)) System.out.println("Valores aceitos"); 
        else System.out.println("Valores nao aceitos");
    }
}
