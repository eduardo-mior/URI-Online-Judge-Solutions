package Iniciante;

/*
 
 QUESTÃO
 Esse ano as Renas do papai Noel decidiram que Rudolph não seria mais aquele 
 que sempre ficaria à frente. Elas escolheriam de forma justa entre elas quem 
 iria encabeçar o trenó. E nada é mais justo que o acaso.

 Então optaram pela seguinte forma para escolher: Cada Rena faria a quantidade 
 que quisesse de bolas de neve, sem as outras verem. Depois, todas as bolas de 
 neve de todas as Renas seriam reunidas em uma única e grande pilha. Por 
 último, as bolas de neve seriam tiradas dessa pilha, uma a uma, e distribuídas 
 entre elas sempre seguindo a ordem: Dasher, Dancer, Prancer, Vixen, Comet, Cupid, 
 Donner, Blitzen e Rudolph. Até que se acabassem as bolas de neve. A rena que 
 ficasse com a última bola de neve seria declarada vencedora e ficaria na posicão
 principal do trenó este ano.

 Dado o número de bolas de neve feitas por cada Rena, determine qual Rena ganhou o sorteio.
 
 ENTRADA
 A entrada é composta por uma única linha contendo 9 números inteiros Ai (1 <= Ai <= 104).
 
 SAÍDA
 A saída é composta por uma única linha contendo o nome da Rena vencedora.

 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2721 {

	private static final String[] RENAS = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	
    	int votos = 0;
    	for (int i = 0; i < 9; i++) {
			votos += leitor.nextInt();
		}
    	
    	int ganhadora = votos % 9;
    	if (ganhadora != 0) 
    		ganhadora -= 1;
    	else 
    		ganhadora = 8;
    	
    	System.out.println(RENAS[ganhadora]);
    }
    
}