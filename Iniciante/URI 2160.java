package Iniciante;

/*
 
 QUESTÃO
 Preencher formulários é uma tarefa simples. Mas é preciso conferir se o 
 espaço reservado para os dados é suficiente.

 Sua tarefa é, dada uma linha de texto, indicar se ele cabe ou não cabe em 
 um formulário com 80 caracteres.
 
 ENTRADA
 A entrada é uma linha de texto L (1 <= |L| <= 500).

 SAÍDA
 A saída é dada em uma única linha. Ela deve ser "YES" (sem as aspas) se a 
 linha de texto L tem até 80 caracteres. Se L tem mais de 80 caracteres, a 
 saída deve ser "NO".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2160 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String nome = leitor.nextLine();
    	System.out.println(nome.length() > 80 ? "NO" : "YES");
    }
	
}