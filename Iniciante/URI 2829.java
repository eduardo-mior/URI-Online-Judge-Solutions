package Iniciante;

/*

 QUESTÃO
 O problema Léxico nos ensinou como ordenar ordenar duas palavras. Entretanto, 
 quando estávamos construindo nossa lista de palavras, o estagiário encarregado 
 confundiu algumas letras maiúsculas com as minúsculas!

 Agora temos uma lista enorme de palavras, que podem ter letras minúsculas, 
 de a a z, e maiúsculas, de A a Z!

 Precisamos ordená-las, obedecendo a mesma ordem de antes, sem importar se as 
 letras são minúsculas ou maiúsculas.

 Só para desempatar, depois que todas as letras foram comparadas, deve-se 
 considerar que as letras maiúsculas vem antes das minúsculas.
 
 ENTRADA
 A primeira linha contém um inteiro 1 <= N <= 5 × 104.
 As N linhas seguintes contém uma palavra da lista, com comprimento máximo de 20 caracteres.
 
 SAÍDA
 A saída deve conter a lista de palavras ordenadas.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class URI 2829 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		int N = leitor.nextInt();
		
		for (int i = 0; i < N; i++) {
			lista.add(leitor.next());
		}
				
		Collections.sort(lista, new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s2.equalsIgnoreCase(s1) ? s1.compareTo(s2) : s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		});
		
		for (String str : lista) { 
			System.out.println(str);
		}		
	}
	
}