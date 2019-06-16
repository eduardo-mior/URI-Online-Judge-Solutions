package Contest;

import java.io.IOException;
import java.util.Scanner;

public class H {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] X = new int[N];
        int pontos = 0;
        for (int i = 0; i < X.length; i++) 
        	X[i] = leitor.nextInt();
        
        for (int i = 1; i < X.length -1; i++) {
    		int maior = X[i];
        	for (int j = i; j != 0; j++) {
        		if (X[j] > maior) maior = X[j];
        	}
        	pontos += maior;
        }
        System.out.println(pontos);
    }
	
}