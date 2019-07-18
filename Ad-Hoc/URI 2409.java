package Ad-Hoc;

/*

 QUESTÃO
 João está comprando móveis novos para sua casa. Agora é a vez de comprar um 
 colchão novo, de molas, para substituir o colchão velho. As portas de sua casa 
 têm altura H e largura L e existe um colchão que está em promoção com dimensões A × B × C.

 O colchão tem a forma de um paralelepípedo reto retângulo e João só consegue 
 arrastá-lo através de uma porta com uma de suas faces paralelas ao chão, mas 
 consegue virar e rotacionar o colchão antes de passar pela porta.

 Entretanto, de nada adianta ele comprar o colchão se ele não passar através das 
 portas de sua casa. Portanto ele quer saber se consegue passar o colchão pelas 
 portas e para isso precisa de sua ajuda.  

 ENTRADA
 A primeira linha da entrada contém três números inteiros A, B e C (1 <= A, B, C <= 300),
  as três dimensões do colchão, em centímetros. A segunda linha contém dois inteiros 
  H e L (1 <= H, L <= 250), respectivamente a altura e a largura das portas em centímetros.

 SAÍDA
 Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco
 antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o 
 produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2409 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int H = leitor.nextInt();
		int L = leitor.nextInt();
		
		     if (A <= H && B <= L) System.out.println("S");
		else if (A <= H && C <= L) System.out.println("S");
		else if (B <= H && A <= L) System.out.println("S");
		else if (B <= H && C <= L) System.out.println("S");
		else if (C <= H && A <= L) System.out.println("S");
		else if (C <= H && B <= L) System.out.println("S");
		else					   System.out.println("N");
    }
    
}