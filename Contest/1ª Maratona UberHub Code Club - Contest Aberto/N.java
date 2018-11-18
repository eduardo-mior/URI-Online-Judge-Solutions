package Contest;

import java.io.IOException;
import java.util.Scanner;

public class N {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int U = leitor.nextInt();
        if (T >= 12 && T <= 18 && U >= 50 && U <= 98) 
        	System.out.println("Setembro chove!");
        else if (T >= 12 && T <= 18 && U >= 10 && U <= 49)
        	System.out.println("Setembro faz sol!");
        else if (T >= 19 && T <= 35 && U >= 50 && U <= 98)
        	System.out.println("Setembro chove!");
        else if (T >= 19 && T <= 35 && U >= 10 && U <= 49)
        	System.out.println("Setembro faz sol!");
        else
        	System.out.println("Setembro faz sol!");
    }
   
}