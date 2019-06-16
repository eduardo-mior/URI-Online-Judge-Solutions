package Iniciante;

/*
 
 QUESTÃO
 A fabricação dos presentes para o Natal é um processo muito complicado. 
 Diversas vezes os duendes ficam até tarde trabalhando para que tudo possa 
 ser terminado a tempo e com perfeição.

 Para melhor gerenciar seus cronogramas, os duendes estipularam quantos minutos 
 são necessários para fabricar cada presente.

 Já está quase no final do expediente, e um dos duendes pediu sua ajuda.

 Faltam N minutos para a hora de ir embora, e restam dois presentes para o 
 duende Ed fabricar. Ajude-o a descobrir se ele conseguirá fabricar os dois 
 ainda hoje, ou se deve deixar o trabalho para amanhã.
 
 ENTRADA
 Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam 
 para o final do expediente (2 <= N <= 100).

 Em seguida haverá dois inteiros A e B, indicando quantos minutos são necessários
 para fabricar os dois presentes que Ed precisa fabricar (1 <= A, B <= 100).
 
 SAÍDA
 Imprima uma linha, contendo a frase "Farei hoje!" caso seja possível fabricar 
 os dois presentes antes do final do expediente, ou "Deixa para amanha!" 
 caso contrário.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2717 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int A = leitor.nextInt() + leitor.nextInt();
    	if (A > N)
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
    }
	
}