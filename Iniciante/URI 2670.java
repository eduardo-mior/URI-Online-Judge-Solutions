package Iniciante;

/*
 
 QUESTÃO
 O novo prédio da Sociedade Brasileira de Computação (SBC) possui 3 andares. 
 Em determinadas épocas do ano, os funcionários da SBC bebem muito café. Por 
 conta disso, a presidência da SBC decidiu presentear os funcionários com 
 uma nova máquina de expresso. Esta máquina deve ser instalada em um dos 3 
 andares, mas a instalação deve ser feita de forma que as pessoas não percam 
 muito tempo subindo e descendo escadas.

 Cada funcionário da SBC bebe 1 café expresso por dia. Ele precisa ir do andar 
 onde trabalha até o andar onde está a máquina e voltar para seu posto de 
 trabalho. Todo funcionário leva 1 minuto para subir ou descer um andar. Como 
 a SBC se importa muito com a eficiência, ela quer posicionar a máquina de 
 forma a minimizar o tempo total gasto subindo e descendo escadas.

 Sua tarefa é ajudar a diretoria a posicionar a máquina de forma a minimizar 
 o tempo total gasto pelos funcionários subindo e descendo escadas.
 
 ENTRADA
 A entrada consiste em 3 números, A1 , A2 , A3 (0 <= A1 , A2 , A3 <= 1000), um 
 por linha, onde Ai representa o número de pessoas que trabalham no i-ésimo andar.
 
 SAÍDA
 Seu programa deve imprimir uma única linha, contendo o número total de minutos 
 a serem gastos com o melhor posicionamento possível da máquina.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2670 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A1 = leitor.nextInt();
        int A2 = leitor.nextInt();
        int A3 = leitor.nextInt();
        int minutos = 0;
        if ((A2 >= A3 && A2 >= A1))
        	minutos = (A3 + A1) * 2;
        else if (A3 >= A1 && (A1 + A2) <= A3)
        	minutos = (A1 * 4) + (A2 * 2);
        else if (A1 >= A3 && (A3 + A2) <= A1)
        	minutos = (A3 * 4) + (A2 * 2);
        else 
        	minutos = (A3 + A1) * 2;
        System.out.println(minutos);
    }
	
}