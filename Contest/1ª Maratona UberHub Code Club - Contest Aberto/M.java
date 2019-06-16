package Contest;

import java.io.IOException;
import java.util.Scanner;

public class M {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int E = leitor.nextInt();
        int X = 0;
        for (int i = 0; i < N; i++) {
        	int A = leitor.nextInt();
        	int B = leitor.nextInt();
        	int C = leitor.nextInt();
        	if (((A + B + C) / 3) >= E)
        		X++;
        }
        System.out.printf("Existe(m) %d candidata(s) estonteante(s)!",  X);
    }
	
}