package Iniciante;

/*
 
 QUESTÃO
 Yuri é um bom companheiro. Sempre fazemos o churras dos “manos ;)” na casa 
 dele! Desta vez, o motivo do churrasco é que os manos estão finalmente 
 começando a passar em bons concursos! Então, hoje teremos aquela edição 
 especial do churras, with alcohol and futebol de sabão!

 A empresa do futebol de sabão está demorando para encher o campo e Yuri, já 
 entendiado, começou a viajar na seguinte pergunta: se assássemos as carnes 
 por ordem da data de validade, qual seria a sequência de peças de carne 
 resultante? Como o MacBook de Yuri está muito longe (e a preguiça está muito 
 perto), ele pediu a sua ajuda para responder esta pergunta.
 
 ENTRADA
 A entrada é composta por vários casos de teste e termina com fim de arquivo. 
 A primeira linha de um caso de teste contém um inteiro N (0 <= N <= 10), que 
 é o número de peças de carne do churrasco de hoje. Em seguida virão N linhas, 
 cada uma com uma cadeia de no máximo 20 caracteres, com apenas caracteres 
 de ‘a’ a ‘z’, e um inteiro Di (0 <= Di <= 50) que representa a data de validade 
 da i-ésima peça. Yuri resolveu colaborar e calcular ao menos este número Di 
 de dias até a data de validade, a partir de hoje, de cada peça de carne. É 
 garantido que se i != j, então Di != Dj .
 
 SAÍDA
 Para cada caso de teste, imprima uma única linha com a sequência de peças de 
 carne que Yuri quer calcular. Cada peça deve estar separada por um único espaço.

*/

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class URI 2633 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int N = leitor.nextInt();
            TreeMap<Integer, String> carnes = new TreeMap<>();
            for (int i = 0; i < N; i++) {
            	String carne = leitor.next();
            	Integer validade = leitor.nextInt();
            	carnes.put(validade, carne);
            }
            System.out.println(String.join(" ", carnes.values()));
        }
    }
	
}