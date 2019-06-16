package Iniciante;

/*
 
 QUESTÃO
 No crepúsculo, a cidade de Portland fica cheia de vampiros e lobisomens. 
 Entretanto, nenhum deles quer ser visto enquanto passeiam pelo centro.

 Vão ser instaladas câmeras de vigilância em cada esquina do centro de 
 Portland. A cada mês, um mapa atualizado com as câmeras já em 
 funcionamento é disponibilizado no site da prefeitura.

 Uma quadra é considerada segura se existem câmeras em, pelo menos, duas 
 de suas quatro esquinas. No centro de Portland todas as quadras são 
 quadrados de mesmo tamanho.

 Sua tarefa é, dado o mapa das câmeras em funcionamento nas esquinas, 
 indicar o status de todas as quadras do centro.
 
 ENTRADA
 A primeira linha da entrada tem um inteiro positivo N (1 <= N <= 100). Nas 
 próximas N+1 linhas, existem N+1 números, que indicam, para cada esquina, 
 a presença ou ausência de uma câmera de vigilância em funcionamento. O 
 número 1 indica que existe uma câmera funcionando na esquina, enquanto o 
 número zero indica que não há câmera funcionando.
 
 SAÍDA
 A saída é dada em N linhas. Cada linha tem N caracteres, indicando se a 
 quadra correspondente é segura ou insegura. Se uma quadra é segura, mostre 
 o caractere S; se não é segura, mostre o caractere U.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2168 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int[][] C = new int[N+1][N+1];
    	
    	for (int i = 0; i < C.length; i++) {
    		for (int j = 0; j < C[i].length; j++) {
    			C[i][j] = leitor.nextInt();
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < N; j++) {
    			if (isSafeZone(C, i, j)) System.out.print("S");
    			else System.out.print("U");
    		}
    		System.out.println("");
    	}
    }
    
    private static boolean isSafeZone(int[][] mat, int i, int j) {
    	int cont = 0;
    	
    	if (mat[i][j] == 1) cont++;
    	if (mat[i+1][j] == 1) cont++;
    	if (mat[i][j+1] == 1) cont++;
    	if (mat[i+1][j+1] == 1) cont++;
    	    	
    	if (cont > 1) return true;
    	else return false;
    }
	
}