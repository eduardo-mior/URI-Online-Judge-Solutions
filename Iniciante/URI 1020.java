package Iniciante;

/*

 QUESTÃO
 Leia um valor inteiro correspondente à idade de uma pessoa em dias e 
 informe-a em anos, meses e dias

 Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias 
 e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
 que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas 
 um exercício com objetivo de testar raciocínio matemático simples.

 ENTRADA
 O arquivo de entrada contém um valor inteiro.

 SAÍDA
 Imprima a saída conforme exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1020 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        idadeDias -= anos * 365;
        int meses = idadeDias / 30;
        idadeDias -= meses * 30;
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
	
}