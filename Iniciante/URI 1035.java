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

public class URI 1035 {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            System.out.println("Valores aceitos"); 
        } else { 
            System.out.println("Valores nao aceitos");
        }
        
    }
    
}