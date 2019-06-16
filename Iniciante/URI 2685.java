package Iniciante;

/*
 
 QUESTÃO
 Júlio está criando um novo Smart Watch especialmente para programadores. 
 É impressionante as vantagens que ele oferece e o conforto pra codar que ele 
 tem. O relógio ainda está em desenvolvimento e ele prometeu consertar os bugs 
 e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para 
 o modo Standy Bay. O problema é que o relógio por si só sempre tem o ângulo de 
 inclinação do Sol/Lua(de 0 a 360). Valendo um relógio, caso deseja aceitar: dada 
 em grau da inclinação do Sol/Lua, informe em qual período do dia ele se encontra.
 
 ENTRADA
 A entrada contém um número inteiro M (0 <= M <= 360) representando o grau do Sol/Lua. 
 Como a posição muda constantemente seu programa receberá diversos casos a cada segundo(EOF).
 
 SAÍDA
 Imprima uma saudação referente ao período do dia que ele se encontra: "Boa Tarde!!", 
 "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2685 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int graus = leitor.nextInt();
    		if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
    		else if (graus < 180) System.out.println("Boa Tarde!!");
    		else if (graus < 270) System.out.println("Boa Noite!!");
    		else if (graus < 360) System.out.println("De Madrugada!!");
    		else System.out.println("Bom Dia!!");
    	}
    }
    
}