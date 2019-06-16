package Iniciante;

/*
 
 QUESTÃO
 Todos os habitantes da Nlogônia estão super animados com a abertura do 
 Ricardo Barreiro World, o mais novo parque de diversões do país. Na TV e 
 no rádio só passam propagandas da montanha-russa do parque, a mais rápida 
 do continente. É nela que todos, de crianças a idosos querem andar.

 Infelizmente foram impostas algumas restrições no momento da homologação do 
 brinquedo pelo governo. Por questões de segurança, há uma altura mínima e uma 
 altura máxima que as pessoam devem ter para poder passear na montanha-russa.

 Para o dia da inauguração do parque, todos os convidados realizaram um 
 pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a 
 operação do parque no primeiro dia, você foi contratado para fazer um 
 programa que dado o número de visitantes, altura mínima, altura máxima e as 
 alturas de todos os visitantes, calcule quantas pessoas poderão andar na 
 montanha-russa.
  
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso consiste 
 em três inteiros N (1 <= N <= 100), Amin e Amax (50 <= Amin <= Amax <= 250), o 
 número de visitantes, a altura mínima e máxima em centímetros para andar na 
 montanha-russa, respectivamente.

 As N linhas seguintes contém, cada uma, um número inteiro Ai (50 <= Ai <= 250), 
 a altura do i-ésimo visitante, em centímetros.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima uma única linha com o número visitantes que 
 podem passear na montanha-russa.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2547 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int min = leitor.nextInt();
			int max = leitor.nextInt();
			int cont = 0;
			for (int i = 0; i < N; i++) {
				int A = leitor.nextInt();
				if (A >= min && A <= max) cont++;
			}
			System.out.println(cont);
		}
	}
	
}