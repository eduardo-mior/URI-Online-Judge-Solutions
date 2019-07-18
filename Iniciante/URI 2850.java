package Iniciante;

/*
 
 QUESTÃO
 Humberto tem um papagaio muito esperto. Quando está com as duas pernas no 
 chão, o papagaio fala em português. Quando levanta a perna esquerda, fala 
 em inglês. Por fim, quando levanta a direita fala em francês. Nico, amigo 
 de Humberto, ficou fascinado com o animal. Em sua emoção perguntou: “E 
 quando ele levanta as duas?”. Antes que Humberto pudesse responder, o 
 papagaio gritou: “Ai eu caio, idiota!”.
 
 ENTRADA
 A entrada consiste de diversos casos de teste. Cada caso de teste consiste 
 uma string informando qual a situação de levantamento de pernas do papagaio.
 
 SAÍDA
 Para cada condição de levantamento de pernas do papagaio, imprima a linguagem 
 que ele utilizará. Caso ele levante as duas pernas, imprima “caiu”. Quebre 
 uma linha a cada caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2850 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String str = leitor.next();
            if (str.equalsIgnoreCase("esquerda")) System.out.println("ingles");
            else if (str.equalsIgnoreCase("direita")) System.out.println("frances");
            else if (str.equalsIgnoreCase("nenhuma")) System.out.println("portugues");
            else System.out.println("caiu");
        }
    }
	
}
