package Contest;

import java.io.IOException;
import java.util.Scanner;

public class C {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	String[] linhas = new String[N];
    	int saltos = 0;
    	for (int i = 0; i < N; i++) {
    		linhas[i] = leitor.next();
    	}
    	for (int i = 1; i < N; i++) {
    		if (linhas[i].startsWith(".")) {
    			if (linhas[i-1].startsWith(".")) {
    				if ((i + 1 < N) && linhas[i+1].startsWith(".")) {
    					System.out.println('N');
    					return;
    				}
    			} else {
        			saltos++;
				}
    		}
    	}
    	System.out.println(saltos);
    }
    
}