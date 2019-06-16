package Iniciante;

/*
 
 QUESTÃO
 No jogo O Bruxo, Sigismund Dijkstra é o líder do Serviço Secreto Redaniano, 
 por causa disso ele é uma das pessoas mais importantes do mundo.

 Além disso Dijkstra possui um grande tesouro, o qual possui diversos tipos de jóias.

 Dijkstra está muito curioso para saber quantos tipos de jóias diferentes seu tesouro possui.

 Sabendo que você é o melhor programador do continente Dijkstra te contratou para 
 verificar quantos tipos de jóias distintas ele tem em seu tesouro.
 
 ENTRADA
 A entrada consiste de várias linhas e cada uma contém uma string que descreve uma das 
 jóias de Dijkstra. Essa string é composta apenas dos caracteres '(' e ')', a soma do 
 tamanho de todas as string não excede 106.
 
 SAÍDA
 Imprima quantos tipos de jóias distintas Dijkstra tem.

*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI 2653 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	Set<String> joias = new HashSet<>();
    	while (leitor.hasNext()) {
    		String joia = leitor.nextLine();
    		joias.add(joia);
    	}
    	System.out.println(joias.size());
    }
	
}