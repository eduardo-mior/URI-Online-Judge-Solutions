package Iniciante;

/*

 QUESTÃO
 Calcule o consumo médio de um automóvel sendo fornecidos a distância 
 total percorrida (em Km) e o total de combustível gasto (em litros).

 ENTRADA
 O arquivo de entrada contém dois valores: um valor inteiro X representando 
 a distância total percorrida (em Km), e um valor real Y representando o 
 total de combustível gasto, com um dígito após o ponto decimal.

 SAÍDA
 Apresente o valor que representa o consumo médio do automóvel com 3 casas 
 após a vírgula, seguido da mensagem "km/l".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1014 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        double y = leitor.nextDouble();
        double media = x / y;
        System.out.println(String.format("%.3f km/l", media));   
    }
	
}