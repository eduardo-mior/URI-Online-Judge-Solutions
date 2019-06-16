package Iniciante;

/*
 
 QUESTÃO
 Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este 
 valor, deve ser apresentado como resposta o mês do ano por extenso, em 
 inglês, com a primeira letra maiúscula.
 
 ENTRADA
 A entrada contém um único valor inteiro.

 SAÍDA
 Imprima por extenso o nome do mês correspondente ao número existente na 
 entrada, com a primeira letra em maiúscula.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1052 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int mes = leitor.nextInt();
        switch (mes) {
	        case 1: System.out.println("January"); break;
	        case 2: System.out.println("February"); break;
	        case 3: System.out.println("March"); break;
	        case 4: System.out.println("April"); break;
	        case 5: System.out.println("May"); break;
	        case 6: System.out.println("June"); break;
	        case 7: System.out.println("July"); break;
	        case 8: System.out.println("August"); break;
	        case 9: System.out.println("September"); break;
	        case 10: System.out.println("October"); break;
	        case 11: System.out.println("November"); break;
	        case 12: System.out.println("December"); break;
        }
    }
	
}