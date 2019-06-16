package Contest;

import java.io.IOException;
import java.util.Scanner;

public class A {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int P = 0;
        for (int i = 0; i < N; i++) {
        	int F = leitor.nextInt();
        	if (F == 1) 
        		P += 30;
        }
        System.out.println(P);
    }
	
}