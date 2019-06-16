package Iniciante;

/*

 QUESTÃO
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
 evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

 ENTRADA
 O arquivo de entrada contém um valor inteiro N.

 SAÍDA
 Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
 horas:minutos:segundos, conforme exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1019 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int duracaoSegundos = leitor.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        int segundos = duracaoSegundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);		
    }
	
}