package Iniciante;

/*
 
 QUESTÃO
 Os cientistas da NASA descobriram um novo exoplaneta que fica a 1 bilhão 
 de anos luz da terra. O nome desse planeta foi batizado de Pronalândia em 
 homenagem aos novos cientistas que estão sendo formados no PRONATEC. Só 
 que o mais incrível ainda está por vir. Ao observar melhor o planeta eles 
 conseguiram identificar que os habitantes da Pronalândia estavam querendo 
 se comunicar por uma numeração. Só que a numeração que encontraram está 
 invertida e como encontraram muitas delas chamaram você para conseguir 
 automatizar esse processo. Logo, dado um número grande, sua tarefa é 
 imprimir esse número invertido.
 
 ENTRADA
 O arquivo contém apenas uma linha de teste que é o número encontrado (0 < n < 9999999999).

 Obs.: Perceba que o número lido é muito alto para armazenar em uma variável 
 do tipo int, logo você irá precisar utilizar o tipo long, que para a leitura e
 impressão em C, você deve utilizar o %llu.
  
 SAÍDA
 Imprimir o número lido invertido. Não esqueça de imprimir a quebra de linha 
 (\n) no final, caso contrário você receberá (Presentation Error).
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1984 {
	
	// Método 1
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String N = String.valueOf(leitor.nextLong());
    	String invertido = "";
    	for (int i = 0; i < N.length(); i++) {
    		invertido += N.charAt(N.length()-i-1);
    	}
    	System.out.println(invertido);
    }
    
    // Método 2
    public static void Main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	String N = String.valueOf(leitor.nextLong());
    	StringBuilder sb = new StringBuilder(N);
    	String invertido = String.valueOf(sb.reverse());
    	System.out.println(invertido);
    }

}