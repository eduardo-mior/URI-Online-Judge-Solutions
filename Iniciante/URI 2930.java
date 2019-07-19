package Iniciante;

/*
 
 QUESTÃO
 Larissa é uma acadêmica muito inteligente e estudiosa, com isso ela é engajada em 
 várias atividades. Chegou o final do ano, mês da sua apresentação de TCC. Ela, 
 muito atarefada, precisa saber se vai conseguir realizar sua apresentação antes 
 do Natal! Mas antes de sua apresentação ela deve passar por uma verificação com 
 sua orientadora oriental, a Prof.Takanada (/Tá com nada/).

 ENTRADA
 A entrada é composta por um valor E (0 < E < 25) representando o dia que foi entregue 
 o tcc pra verificação. Um valor D (0 < D < 25) que representa a data final pra entregar 
 para verificação.
 
 SAÍDA
 Mostre, para cada caso de teste, se a acadêmica apresentará ou não. A única possibilidade 
 da entrega não ser realizada na data é por falta de orientação da Takanada. Caso não seja
 possivel, imprima "Eu odeio a professora!". Caso seja entregue em até 3 dias antes do prazo 
 final, imprima "Muito bem! Apresenta antes do Natal!", caso contrário, sendo muito próximo 
 da data limite imprima "Parece o trabalho do meu filho!", nesse ultimo caso, é adicionado 
 mais dois dias para correções, e caso a data final seja menor que a véspera do natal(24), 
 ela poderá apresentar, sendo impresso "TCC Apresentado!", caso contrário imprima "Fail! Entao eh nataaaaal!"

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2930 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int e = leitor.nextInt();
    	int d = leitor.nextInt();
    	if (e > d) {
    		System.out.println("Eu odeio a professora!");
    	} else if ((d - e) >= 3) {
    		System.out.println("Muito bem! Apresenta antes do Natal!");
    	} else if ((e + 2) < 24) {
    		System.out.println("Parece o trabalho do meu filho!\nTCC Apresentado!");
    	} else {
    		System.out.println("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!");
    	}
    }
    
}