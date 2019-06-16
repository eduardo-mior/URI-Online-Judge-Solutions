package Iniciante;

/*
 
 QUESTÃO
 A Googlbook é uma famosa empresa de tecnologia mundial que acabou de abrir 
 uma filial na sua cidade! Além disso, a Googlbook também acabou de abrir as 
 inscrições do processo seletivo para uma vaga de estágio na empresa!

 Para se inscrever no processo seletivo, você deve enviar algumas informações 
 para a empresa, que irá usá-las para decidir quem será contemplado com a 
 vaga. Você já enviou todas as informações necessárias, exceto uma: seu IRA 
 (Índice de Rendimento Acadêmico). Para piorar, o Portão do Aluno, sistema 
 que disponibiliza o histórico com IRA, está fora do ar!

 Felizmente, você lembra de suas notas em todas as M disciplinas que cursou, 
 além de suas respectivas cargas horárias. Você também lembra que o IRA é 
 calculado da seguinte maneira: http://prntscr.com/kvvhk7
 
 , onde N1, N2, ..., NM são suas notas em cada disciplina, e C1, C2, ..., 
 CM são as cargas horárias das discplinas respectivas.

 Dada a nota obtida e a carga horária de cada disciplina, determine seu IRA 
 para poder enviá-lo para a Googlbook o mais breve possível!
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 o inteiro M (1 <= M <= 40), o número de disciplinas cursadas. As próximas M 
 linhas descrevem uma disciplina cada. Cada linha contém dois inteiros Ni e 
 Ci (0 <= Ni <= 100, 30 <= Ci <= 120), indicando a nota obtida na disciplina e a 
 carga horária da mesma, respectivamente.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima uma linha contendo o valor do seu IRA. Arredonde 
 e imprima a resposta com exatamente 4 casas decimais. 
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2533 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int M = leitor.nextInt();
			int totalC = 0;
			int totalNC = 0;
			for (int i = 0; i < M; i++) {
				double N = leitor.nextInt();
				double C = leitor.nextInt();
				totalNC += N * C;
				totalC += C;
			}
			double resultado = totalNC / (totalC * 100.0);
			System.out.println(String.format("%.4f", resultado));
		}
	}
	
}