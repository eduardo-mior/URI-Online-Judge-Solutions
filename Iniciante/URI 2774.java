package Iniciante;

/*
 
 QUESTÃO
 O professor está te ensinando sobre sensores. Este é um elemento muito importante 
 em diversas aplicações. Para aprender melhor os conceitos de precisão o professor 
 pediu para realizar uma montagem prática do sensor Termo Ind v4.0 no novo 
 laboratório de Automação.

 Você como bom aluno anotou a fórmula para o cálculo da precisão de um sensor:

 Onde QT é a quantidade de vezes que foi realizado o teste, X o valor medido em cada 
 teste e ¯X¯ a média dos valores.

 Para realizar o teste você ficou H horas fazendo testes, e a cada M minutos você 
 verificou o valor X da temperatura entregue pelo sensor.

 Agora que você tem as medidas, e como você tem a habilidade de programar, faça um 
 programa que entregue a precisão do sensor.
 
 ENTRADA
 Existem vários casos de teste, cada caso consiste de duas linhas. A primeira contém 
 dois valores H e M. E a segunda consiste dos valores de ponto flutuante Xi indicando 
 o valor de cada medida do sensor.

 É garantido que haverão no mínimo 5 e no máximo 105 medidas por caso e que estes 
 valores estão no intervalo [0, 255] com duas casas decimais.
 
 SAÍDA
 Para cada caso de teste, imprima uma única linha com um número indicando a precisão 
 do sensor. O valor calculado deve ser apresentado com 5 dígitos após o ponto decimal.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2774 {
	    
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int H = leitor.nextInt();
    		int M = leitor.nextInt();
            int QT = H * 60 / M;
    		double avg = 0;
    		double sum = 0;
    		double ans = 0;
    		double[] x = new double[QT];
    		for (int i = 0; i < QT; i++) {
    			x[i] = leitor.nextDouble();
    			avg += x[i];
    		}
    		avg /= (double) QT;
            for(int i = 0; i < QT; i++){
                sum += Math.pow(x[i] - avg, 2.0);
            }
            ans = Math.sqrt(sum / (double) (QT - 1));
            System.out.println(String.format("%.5f", ans));
    	}
    }
    
}