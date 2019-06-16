package Ad-Hoc;

/*
 
 QUESTÃO
 Você sempre fica tão animado nesta época do ano que adora falar sobre isso o 
 tempo todo! Neste ano, você tem gritado aos quatro ventos: Então é natal!! 
 Colocando toda essa felicidade pra fora, você montou novamente um programa 
 neste ano que, colocando um índice I de felicidade, seu grito de "Então é Natal!" 
 é cada vez mais animado!

 ENTRADA
 A entrada é composta por um inteiro I (1 < I <= 104) que representa o seu índice de felicidade.
 
 SAÍDA
 A saída é composta pela frase "Entao eh Natal!", sendo repetidas I vezes as letras 
 a da frase. Uma quebra de linha é necessária após a impressão da frase.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2926 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int I = leitor.nextInt();
    	String a = "";
    	for (int i = 0; i < I; i++) {
    		a += "a";
    	}
    	System.out.println("Entao eh Natal!".replace("a", a));
    }
    
}