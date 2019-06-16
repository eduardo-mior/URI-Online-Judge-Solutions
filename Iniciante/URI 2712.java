package Iniciante;

/*
 
 QUESTÃO
 O rodízio municipal de veículos de São Paulo é uma restrição à circulação de 
 veículos automotores na cidade. Implantado desde 1996 com o propósito de 
 melhorar as condições ambientais reduzindo a carga de poluentes na atmosfera, 
 se consolidou como um instrumento para reduzir congestionamentos nas 
 principais vias da cidade, nos horários de maior movimento. Nas vias 
 delimitadoras não é permitido o tráfego de caminhões e automóveis que 
 estejam dentro da restrição. Há uma escala que determina em quais dias da 
 semana quais veículos não podem circular. Essa escala é regida pelo último 
 dígito da placa do veículo, sendo:

 Segunda-feira, digito final da placa 1 e 2
 Terça-feira, digito final da placa 3 e 4
 Quarta-feira, digito final da placa 5 e 6
 Quinta-feira, digito final da placa 7 e 8
 Sexta-feira, digito final da placa 9 e 0
 
 Os motoristas que são flagrados violando a restrição de circulação são 
 autuados com multa e quatro pontos na carteira de habilitação.
 
 ENTRADA
 A primeira linha de entrada representa a quantidade de testes N (0 <= N < 1000) 
 que deverão ser considerados. As demais entradas são cadeia de caracteres 
 com tamanho máximo S (1 <= S <= 100) que representam cada placa que deverá 
 ser analisada, de tal forma que, cada placa fique em uma única linha de 
 entrada. O formato esperado para uma placa veicular válida em São Paulo é 
 "AAA-9999", tal que A é um caracter válido em [A-Z], e 9 um dígito numérico 
 válido em [0-9].
 
 SAÍDA
 O conjunto de valores válidos como saída são: MONDAY, TUESDAY, WEDNESDAY, 
 THURSDAY e FRIDAY, de acordo com a tabela de restrições predefinida, e FAILURE 
 caso a placa não apresente o padrão definido.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2712 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    		String placa = leitor.next();
    		if (isValidTag(placa)) {
    			int digit = Integer.valueOf(String.valueOf(placa.charAt(7)));
    		         if (digit == 1 || digit == 2) System.out.println("MONDAY");
    			else if (digit == 3 || digit == 4) System.out.println("TUESDAY");
    			else if (digit == 5 || digit == 6) System.out.println("WEDNESDAY");
    			else if (digit == 7 || digit == 8) System.out.println("THURSDAY");
    			else System.out.println("FRIDAY"); 
    		} else {
    			System.out.println("FAILURE");
    		}
    	}
    }
    
    public static boolean isValidTag(String placa) {
    	return placa.matches("[A-Z]{3}-[0-9]{4}");
    }
    
}