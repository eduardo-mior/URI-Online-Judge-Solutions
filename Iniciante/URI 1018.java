package Iniciante;

/*

 QUESTÃO
 Leia um valor inteiro. A seguir, calcule o menor número de notas 
 possíveis (cédulas) no qual o valor pode ser decomposto. As notas 
 consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o 
 valor lido e a relação de notas necessárias.

 ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

 SAÍDA
 Imprima o valor lido e, em seguida, a quantidade mínima de notas de 
 cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de 
 imprimir o fim de linha após cada linha, caso contrário seu programa 
 apresentará a mensagem: “Presentation Error”.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1018 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -= notas50 * 50;
        int notas20 = atual / 20;
        atual -= notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;
        
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
	
}