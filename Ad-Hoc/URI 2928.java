package Ad-Hoc;

/*

 QUESTÃO
 O polo norte vem enfrentando um problema de logística devido ao aquecimento 
 global. Isso se deve ao fato de que a fabrica e o armazém de brinquedos 
 encontram-se em margens opostas de um lago que costumava estar congelado 
 durante o ano inteiro. Entretanto com o aumento da temperatura nos últimos 
 anos o gelo que cobre o lago vem ficando cada vez menos espesso. Para contornar 
 o problema Balladug ,um gnomo élfico muito esperto, criou um radar que consegue 
 mapear a espessura do gelo. Assim Balladug entregou o mapa do lago para os 
 gnomos élficos encarregados do transporte. Tais gnomos conseguem pular numa 
 distância máxima de 2 metros. Com o mapa em mãos, os gnomos de saber se é possível 
 cruzar o lago de gelo com seus pulos e se for possível eles gostariam de saber 
 quantos pulos terão que dar para tal.

 ENTRADA
 A entrada consiste de um número inteiro N (0<N<101) que representa a quantidade 
 de linhas do mapa. As próximas N linhas contem até 10 caracteres onde o 
 caractere "-" representa uma região de gelo firme e o caractere "." representa uma 
 região de gelo fino que irá quebrar caso seja pisado. Cada linha representa um 
 metro de largura no mapa.Considere que os gnomos iniciam no canto superior esquerdo 
 e devem cruzar todo o lago até chegarem em qualquer posição da margem oposta que se 
 encontra após a última linha do mapa.Uma linha sempre será composta inteiramente pelo 
 mesmo caractere.

 SAÍDA
 A saída consiste de um inteiro inteiro indicando o número de pulos para percorrer o 
 lago ou do caractere "N"caso seja impossível cruzar o lago. Não esqueça de deixar uma 
 linha em branco após a resposta.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2928 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	String[] linhas = new String[N];
    	int saltos = 0;
    	for (int i = 0; i < N; i++) {
    		linhas[i] = leitor.next();
    	}
    	for (int i = 1; i < N; i++) {
    		if (linhas[i].startsWith(".")) {
    			if (linhas[i-1].startsWith(".")) {
    				if ((i + 1 < N) && linhas[i+1].startsWith(".")) {
    					System.out.println('N');
    					return;
    				}
    			} else {
        			saltos++;
				}
    		}
    	}
    	System.out.println(saltos);
    }
    
}