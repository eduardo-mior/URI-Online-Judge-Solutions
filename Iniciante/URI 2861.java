package Iniciante;

/*
 
 QUESTÃO
 Cacunda, Bizz e Massacote são amigos inseparáveis. Na faculdade, em alguns 
 dias, não iam à aula para jogar truco. Certo dia, um professor estava 
 passando perto deles. Na mesma hora, os três gritaram bem alto a palavra 
 “gzuz”. Após esse grito, ficaram invisíveis, e o professor não os viu. 
 Outra vez, a turma deles estava respondendo perguntas do professor. 
 Quando era a vez de algum deles, respondiam com a palavra “gzuz”, e o 
 professor aceitava como resposta e dava a nota máxima da pergunta. Faça a 
 simulação da saída que eles encontraram para se safar dos mais diversos problemas.
 
 ENTRADA
 A entrada é composta por vários casos de teste. A primeira linha contém um 
 número inteiro C (2 <= C <= 99) relativo ao número de perguntas que o professor 
 fez. As C linhas seguintes vêm com uma pergunta feita pelo professor.
 
 SAÍDA
 Para cada pergunta, imprima a resposta que foi dita pelos três amigos.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2861 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        for (int i = 0; i < C; i++) {
        	leitor.nextLine();
        	System.out.println("gzuz");
        }
    }
	
}