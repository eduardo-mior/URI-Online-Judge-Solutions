package Estruturas e Bibliotecas;

/*

 QUESTÃO
 Segundo a tradição, as provas das Olimpíadas de Natal são muito interessantes 
 e diferentes. Dentre as provas existentes, podemos citar por exemplo, o 
 levantamento de saco de brinquedos, a escalada de pinheiros, o hipismo com renas, 
 o arremesso de duendes (com e sem o consentimento deles - esse segundo é mais 
 perigoso) e o tempo de mergulho em buraco no gelo sem equipamentos, entre outros.

 Parte do melhoramento da competição proposto por Noel para este ano sera a 
 disponibilização do quadro de medalhas dos países participantes através de um 
 placar eletrônico. Você foi convidado para viajar até as montanhas de Korvatunturi 
 na Lapônia, Finlândia, aonde será a sede destes jogos, para, à partir de uma relação 
 das provas e os países vencedores, desenvolver o sistema para este placar.

 Serão quase trezentos países participantes e até 1000 modalidades de provas, no máximo.
 
 ENTRADA
 A entrada contem um unico caso de teste que consiste em uma relacao com o resultado 
 de todas as provas realizadas nas Olimpíadas de Natal. Cada prova ou modalidade contém 
 quatro linhas de informação: a primeira linha contém a descrição da prova, a segunda 
 linha contém o país que ficou campeão nesta modalidade, a terceira linha contém o país 
 vice-campeão e a última linha contém o país que ficou com a medalha de bronze na 
 referida prova. O final da entrada é determinado por EOF.
 
 SAÍDA
 Como saída, deve ser impresso o quadro de medalhas das Olimpíadas de Natal. A primeira 
 linha contém a informação "Quadro de Medalhas". Cada uma das próximas linhas conterá o 
 nome de um país seguido pelo respectivo número de medalhas de ouro, prata e bronze que 
 este país conquistou, separadas por um espaço em branco. O critério de desempate é, na 
 ordem, o número de medalhas de ouro seguido pelo número de medalhas de prata e de bronze. 
 Se países empatarem nestes três critérios, a listagem será por ordem ascendente do nome 
 do país participante.
 
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class URI2018 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, Equipe> equipes = new HashMap<>();
		
		while (leitor.hasNext()) {
			String modalidade = readLine(leitor); 
			for (int i = 0; i < 3; i++) {
				String nomeEquipe = readLine(leitor); 
				Equipe equipe;
				if (equipes.containsKey(nomeEquipe)) {
					equipe = equipes.get(nomeEquipe);
				} else {
					equipe = new Equipe(nomeEquipe);
					equipes.put(nomeEquipe, equipe);
				}
				equipe.medalhas[i]++;
			}
		}
		
		List<Equipe> listaEquipes = new ArrayList<>(equipes.values());
		Collections.sort(listaEquipes);
		
		System.out.println("Quadro de Medalhas");
		for (Equipe equipe : listaEquipes) {
			System.out.println(equipe);
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
	
}

class Equipe implements Comparable<Equipe> {
	
	public String nome;
	public int[] medalhas;
	
	public Equipe(String nome) {
		this.nome = nome;
		this.medalhas = new int[3];
	}
		
	@Override
	public int compareTo(Equipe e) {
		if (this.medalhas[0] > e.medalhas[0]) 
			return -1;
		else if (this.medalhas[0] < e.medalhas[0])
			return 1;
		else if (this.medalhas[1] > e.medalhas[1])
			return -1;
		else if (this.medalhas[1] < e.medalhas[1])
			return 1;
		else if (this.medalhas[2] > e.medalhas[2])
			return -1;
		else if (this.medalhas[2] < e.medalhas[2])
			return 1;
		else
			return this.nome.compareTo(e.nome);
	}
	
	@Override
	public String toString() {
		return nome + " " + medalhas[0] + " " + medalhas[1] + " " + medalhas[2];
	}
	
}