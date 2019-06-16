package Contest;

import java.io.IOException;
import java.util.Scanner;

public class K {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[][] cubo = new int[3][3];
        for (int i = 0; i < cubo.length; i++) 
        	for (int j = 0; j < cubo[i].length; j++) 
        		cubo[i][j] = leitor.nextInt();
        if (cubo[0][1] == cubo[1][0] && cubo[0][1] == cubo[1][1] && cubo[0][1] == cubo[1][2] && cubo[0][1] == cubo[2][1])
        	System.out.println("Cruz formada! Pode continuar!");
        else
        	System.out.println("Forme a cruz!");
    }
	
}