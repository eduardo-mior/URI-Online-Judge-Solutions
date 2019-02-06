package Contest;

import java.io.IOException;
import java.util.Scanner;

public class E {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int E = leitor.nextInt();
    	int D = leitor.nextInt();
    	if (E > D) {
    		System.out.println("Eu odeio a professora!");
    	} else if ((D - E) >= 3) {
    		System.out.println("Muito bem! Apresenta antes do Natal!");
    	} else {
    		System.out.println("Parece o trabalho do meu filho!");
    		if (E + 2 < 24) {
    			System.out.println("TCC Apresentado!");
    		} else {
    			System.out.println("Fail! Entao eh nataaaaal!");
    		}
    	}
    }
    
}