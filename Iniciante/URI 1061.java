package Iniciante;

/*
 
 QUESTÃO
 Pedrinho está organizando um evento em sua Universidade. O evento deverá 
 ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que 
 Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe 
 quando inicia e quando termina o evento.

 Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá 
 ajudar Pedrinho a calcular a duração deste evento.
 
 ENTRADA
 Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço 
 e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o 
 momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta 
 linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, 
 indicando o término do evento.
 
 SAÍDA
 Na saída, deve ser apresentada a duração do evento, no seguinte formato:

 W dia(s)
 X hora(s)
 Y minuto(s)
 Z segundo(s)
 
 Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1061 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
        String[] SdiaInicial = leitor.nextLine().split(" ");
        String[] ShoraInicial = leitor.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = leitor.nextLine().split(" ");
        String[] ShoraFinal = leitor.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(SdiaInicial[1]);
        int horaInicial = Integer.parseInt(ShoraInicial[0]);
        int minutoInicial = Integer.parseInt(ShoraInicial[1]);
        int segundoInicial = Integer.parseInt(ShoraInicial[2]);
        int diaFinal = Integer.parseInt(SdiaFinal[1]);
        int horaFinal = Integer.parseInt(ShoraFinal[0]);
        int minutoFinal = Integer.parseInt(ShoraFinal[1]);
        int segundoFinal = Integer.parseInt(ShoraFinal[2]);
        
        if (segundoFinal < segundoInicial) {
        	totalSegundos += (60 - segundoInicial) + segundoFinal;
        	totalMinutos--;
        } else if (segundoFinal > segundoInicial) {
        	totalSegundos += segundoFinal - segundoInicial;
        } else {
        	totalSegundos = 0;
        }
        
        if (minutoFinal < minutoInicial) {
        	totalMinutos += (60 - minutoInicial) + minutoFinal;
        	totalHoras--;
        } else if (minutoFinal > minutoInicial)  {
        	totalMinutos += minutoFinal - minutoInicial;
        } else {
        	totalMinutos = 0;
        }
        
        if (horaFinal < horaInicial) {
        	totalHoras += (24 - horaInicial) + horaFinal;
        	totalDias--;
        } else if (horaFinal > horaInicial) {
        	totalHoras += horaFinal - horaInicial;
        } else {
        	totalHoras = 0;
        }
        
        if (diaFinal < diaInicial) {
        	totalDias += (30 - diaInicial) + diaFinal;
        } else if (diaFinal > diaInicial) {
        	totalDias += diaFinal - diaInicial;
        } else {
        	totalDias = 0;
        }
                
        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");
    }
	
}