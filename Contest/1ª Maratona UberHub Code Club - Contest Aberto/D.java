package Contest;

import java.io.IOException;
import java.util.Scanner;

public class D {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double N = leitor.nextInt();
        double X = leitor.nextInt();
        double percent = (X * 100.0) / N;
        if (percent > 60)
        	System.out.println("Ta muito feliz!");
        else if (percent >= 50) 
        	System.out.println("Ta feliz!");
        else 
        	System.out.println("Ta triste!");
    }
	
}