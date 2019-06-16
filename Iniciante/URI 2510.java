package Iniciante;

/*
 
 QUESTÃO
 Como todos sabem, existem diversos heróis que defendem a humanidade de capangas 
 e forças do mal. Em Codham, uma das cidades mais sombrias que existem, vive 
 Batmain, o cavaleiro das trevas. Resumidamente, Batmain nada mais é que um ser 
 humano gênio, multibilionário, filantropo que também é mestre em mais de cem 
 artes marciais. Apesar de ninguém conhecer sua real identidade, por ele utilizar 
 uma armadura com disfarce de morcego, todas as pessoas do bem o amam. 
 Obviamente, as pessoas más o temem. Após diversas batalhas, todos os seus 
 vilões haviam sido capturados pelo Batmain e a sensação de segurança parecia 
 fazer parte dos cidadãos de Codham novamente. Toda essa tranquilidade atípica 
 deixou de existir a dois dias, quando o palhaço do crime – também conhecido como 
 Coderinga ­– escapou de Arkham e conseguiu tornar a cidade mais caótica do que 
 nunca. Você trabalha para a polícia de Codham, em um reconhecido cargo de 
 batprogramador (profissão responsável por resolver problemas que envolvem o 
 cavaleiro das trevas, realizando a codificação de algoritmos) e lhe foi 
 solicitado a seguinte tarefa: dizer, para cada vilão, se ele alguma vez já foi 
 capturado pelo cavaleiro das trevas.
 
 ENTRADA
 A primeira linha da entrada é composta por um número inteiro T que indica a 
 quantidade de casos de testes. Cada caso de teste é composto por uma cadeia de 
 caracteres de tamanho N (1 < N < 26). Todos os caracteres são letras maiúsculas 
 ou minúsculas do alfabeto inglês.
 
 SAÍDA
 Caso o vilão alguma vez já foi capturado pelo Batmain, imprima Y. Caso contrário, imprima N.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2510 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int T = leitor.nextInt();
		for (int i = 0; i < T; i++) {
			String vilao = leitor.nextLine();
			System.out.println("Y");
		}
	}
	
}