package Iniciante;

/*
 
 QUESTÃO
 Um novo conjunto de autenticação será implementado no Instituto Federal do 
 Sul de Minas, campus Muzambinho.

 Bom, o novo serviço de autenticação é seguro, sem bugs e dores de cabeça 
 mesmo porque estamos no final de semestre. Ele permitirá que sua senha 
 tenha espaços, mas não números ou caracteres especiais. A atualização 
 ocorre sempre no período de férias, para que todos os ajustes sejam feitos 
 e no final agrade todos os usuarios. Como estagiário da central de suporte 
 da escola, seu dever é implementar a nova autenticação. Por enquanto o novo 
 padrão para nomes de usuários está sendo estudado.
 
 Como podemos perceber para cada conjunto de letras teremos um numero especifico. 
 Bole um programa maroto para fazer essa conversão das letras para os números,
 e como você não acessará as senhas dos alunos, faça um algoritmo para que o 
 mesmo faça o processo sozinho usando seus proprios casos de teste.

 Obs : Seus casos de teste não poderão passar de 20 caracterese e a saída, 12 digitos.
 
 ENTRADA
 Você terá N indicando a quantidade de senhas que serão trocadas, em seguida N casos de testes.

 SAÍDA
 A saída será uma lista com os novos números, criptografados das senhas que foram digitadas.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2690 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0 ; i < N; i++) {
    		String password = readLine(leitor);
    		StringBuilder crypt = new StringBuilder();
    		for (char c : password.toCharArray()) {
    			if (crypt.length() == 12) break;
    			     if (c == 'G' || c == 'Q' || c == 'a' || c == 'k' || c == 'u')             crypt.append('0');
    			else if (c == 'I' || c == 'S' || c == 'b' || c == 'l' || c == 'v')             crypt.append('1');
    			else if (c == 'E' || c == 'O' || c == 'Y' || c == 'c' || c == 'm' || c == 'w') crypt.append('2');
    			else if (c == 'F' || c == 'P' || c == 'Z' || c == 'd' || c == 'n' || c == 'x') crypt.append('3');
    			else if (c == 'J' || c == 'T' || c == 'e' || c == 'o' || c == 'y')             crypt.append('4');
    			else if (c == 'D' || c == 'N' || c == 'X' || c == 'f' || c == 'p' || c == 'z') crypt.append('5');
    			else if (c == 'A' || c == 'K' || c == 'U' || c == 'g' || c == 'q')             crypt.append('6');
    			else if (c == 'C' || c == 'M' || c == 'W' || c == 'h' || c == 'r')             crypt.append('7');
    			else if (c == 'B' || c == 'L' || c == 'V' || c == 'i' || c == 's')             crypt.append('8');
    			else if (c == 'H' || c == 'R' || c == 'j' || c == 't')                         crypt.append('9');
    		}
    		System.out.println(crypt);
    	}
    }
    
	private static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty()) {
			line = leitor.nextLine();
		}
		return line;
	}
    
}