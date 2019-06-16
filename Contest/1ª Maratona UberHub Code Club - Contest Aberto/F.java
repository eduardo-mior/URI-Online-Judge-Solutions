package Contest;

import java.io.IOException;
import java.util.Scanner;

public class F {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Long A = leitor.nextLong();
        Long B = leitor.nextLong() * 2;
        Long C = leitor.nextLong() * 3;
        Long X = leitor.nextLong();
        Long Y = leitor.nextLong();
        Long Z = leitor.nextLong();
        if (X >= A && Y >= B && Z >= C) 
        	System.out.println("SIM");
        else
        	System.out.println("NAO");
    }
	
}