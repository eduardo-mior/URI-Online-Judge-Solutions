package Contest;

import java.io.IOException;
import java.util.Scanner;

public class B {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String N = leitor.nextLine();
        for (int i = 0; i < 3; i++) {
        	String S = leitor.nextLine();
        	if (N.equals(S)) {
        		System.out.println("Porta liberada!");
        		return;
        	}
        }
        System.out.println("Porta bloqueada!");
    }
	
}