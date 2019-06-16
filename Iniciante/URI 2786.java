package Iniciante;

/*
 
 QUESTÃO
 O colégio pretende trocar o piso de uma sala de aula e a diretora aproveitou 
 a oportunidade para passar uma tarefa aos alunos. A sala tem o formato de um 
 retângulo de largura L metros e comprimento C metros, onde L e C são números 
 inteiros. A diretora precisa comprar lajotas de cerâmica para cobrir todo o 
 piso da sala. Seria fácil calcular quantas lajotas seriam necessárias se cada 
 lajota fosse um quadrado de 1 metro de lado. O problema é que a lajota que a 
 diretora quer comprar é um quadrado que possui 1 metro de diagonal, não de 
 lado. Além disso, ela quer preencher o piso da sala com as diagonais das 
 lajotas alinhadas aos lados da sala, como na figura.

 A loja vai fornecer lajotas do tipo 1: inteiras; do tipo 2, que correspondem à 
 metade das do tipo 1, cortadas ao longo da diagonal; e lajotas do tipo 3, que 
 correspondem à metade do tipo 2. Veja os três tipos de lajotas na figura.

 Está muito claro que sempre serão necessárias 4 lajotas do tipo 3 para os 
 cantos da sala. A tarefa que a diretora passou para os alunos é calcular o 
 número de lajotas dos tipos 1 e 2 que serão necessárias. Na figura, para L = 3 
 e C = 5, foram necessárias 23 do tipo 1 e 12 do tipo 2. Seu programa precisa 
 computar, dados os valores de L e C, a quantidade de lajotas do tipo 1 e do 
 tipo 2 necessárias.
 
 ENTRADA
 A primeira linha da entrada contém um inteiro L (1 <= L <= 100) indicando a 
 largura da sala. A segunda linha contém um inteiro C (1 <= C <= 100) 
 representando o comprimento da sala.
 
 SAÍDA
 Imprima duas linhas na saída. A primeira deve conter um inteiro, representando 
 o número de lajotas do tipo 1 necessárias. A segunda deve conter um inteiro, 
 indicando o número de lajotas do tipo 2.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2786 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int L = leitor.nextInt();
        int C = leitor.nextInt();
        int lajes1 = (L * C) + ((L - 1) * (C - 1));
        int lajes2 = ((L - 1) * 2) + ((C - 1) * 2);
        System.out.println(lajes1);
        System.out.println(lajes2);
    }
	
}