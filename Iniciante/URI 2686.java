package Iniciante;

/*
 
 QUESTÃO
 Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o 
 seu o programa anterior só informava uma saudação, ele pediu que transformasse 
 o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a 
 posição do Sol/Lua, refaça o sistema só que agora além da saudação de cada 
 período do dia, informe exatamente as horas, os minutos e segundos.
 
 ENTRADA
 A entrada contem um pontos flutuantes M (0 >= M < 360) representando a posição, 
 em graus,do Sol/Lua em relação a terra. Como eles andam em constante movimento seu 
 programa receberá diversos casos a cada segundo(EOF).
 
 SAÍDA
 Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" 
 e "De Madrugada!!", e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2686 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		double graus = leitor.nextDouble();
    		
    		if (graus <= 360) {
	    		if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
	    		else if (graus < 180) System.out.println("Boa Tarde!!");
	    		else if (graus < 270) System.out.println("Boa Noite!!");
	    		else if (graus < 360) System.out.println("De Madrugada!!");
	    		else System.out.println("Bom Dia!!");
	    		    
	    		Double horas;
	    		if (graus >= 270) {
	    			horas = ((graus - 270.0) * 4.0) / 60.0;
	    		} else {
	    			horas = ((graus * 4.0) / 60.0) + 6.0;
	    		}
	    		
	    		Double minutos = (horas * 60.0) % 60.0;
	    		Double segundos = (minutos * 60.0) % 60.0;
	    		
	    		if (segundos > 59) {
	    			segundos = 0.0;
	    			minutos += 1.0;
	    		}
	    		
	    		System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
    		}
    	}
    }
    
}