package Iniciante;

import java.io.IOException;
import java.util.Scanner;

/*
 
 QUESTÃO
 Roberto é um dos grandes professores que compõem o corpo docente da 
 universidade de sua cidade. Treinar seus alunos para a maratona de 
 programação é uma de suas maiores paixões, apesar de ser uma tarefa bem 
 difícil. Felizmente, neste semestre, vários alunos se inscreveram para 
 sua disciplina de programação competitiva.

 Para treinar seus alunos, Roberto costuma aplicar testes e provas 
 regularmente, onde sempre divide sua turma em diferentes duplas, já que 
 neste ano, as equipes da maratona de programação serão formadas por apenas d
 ois integrantes.

 Ao longo do semestre, analisando os resultados das avaliações e o 
 comportamento dos estudantes em sala de aula, Roberto percebeu que se os 
 alunos escolhidos para formar uma dupla não têm afinidade, o desempenho 
 da equipe é bem inferior em relação às duplas formadas por alunos que 
 apresentam tal comportamento. Podemos dizer que dois estudantes A e B 
 possuem afinidade caso pertençam ao mesmo grupo de amigos, ou seja, caso 
 possuam uma relação direta de amizade, ou se é possível escrever uma sequência 
 de alunos X1, X2, X3, ... , XN , onde para todo i < N exista uma relação 
 direta de amizade entre os alunos Xi e Xi+1, com X1 = A e XN = B.

 A maratona de programação se aproxima e Roberto decidiu que montará duplas 
 compostas apenas por alunos que possuem afinidade. Desta forma, as equipes de 
 sua universidade serão mais competitivas, aumentando as chances de 
 classificação para a próxima fase. Como a turma está abarrotada de alunos, 
 ele pediu para você escrever um programa em que dadas as relações de amizades 
 entre os alunos e uma série de consultas indicando dois estudantes, determine 
 para cada consulta se é possível montar uma dupla com estes dois alunos.
 
 ENTRADA
 A entrada é composta por vários casos de teste. A primeira linha de um caso 
 de teste possui três inteiros N, M e Q (2 <= N <= 104, 0 <= M <= 105, 1 <= Q <= 103), 
 representando, respectivamente, o número de alunos, as relações de amizade 
 entre os estudantes e o número de consultas. As próximas M linhas possuem 
 dois inteiros X e Y (1 <= X, Y <= N e X != Y) indicando que o aluno X tem uma 
 relação direta de amizade com o aluno Y. Em seguida, cada uma das próximas 
 Q linhas descreve uma consulta com dois inteiros A e B (1 <= A, B <= N e A != B), 
 indicando os estudantes de uma possível equipe.
 
 SAÍDA
 Para cada caso de teste imprima Q linhas, onde a i-ésima linha é a resposta 
 para a i-ésima consulta. Se for possível montar uma dupla com os estudantes 
 indicados na consulta imprima o caractere ‘S’, caso contrário imprima o 
 caractere ‘N’. Imprima uma linha em branco ao final de cada caso de teste.
 
*/

public class URI 2631 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();
			int Q = leitor.nextInt();
			UF union = new UF(N+999);
			
			for (int i = 0; i < M; i++) {
				int x = leitor.nextInt() + 1;
				int y = leitor.nextInt() + 1;
				union.union(x, y);
			}
			
			for (int i = 0; i < Q; i++) {
				int x = leitor.nextInt() + 1;
				int y = leitor.nextInt() + 1;
				if (union.connected(x, y)) System.out.println("S");
				else System.out.println("N");
			}
			if (leitor.hasNext()) System.out.print("\n");
		}
	}

}

class UF {

    private int[] parent;  // parent[i] = parent of i
    private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
    private int count;     // number of components

    /**
     * Initializes an empty union–find data structure with {@code n} sites
     * {@code 0} through {@code n-1}. Each site is initially in its own 
     * component.
     *
     * @param  n the number of sites
     * @throws IllegalArgumentException if {@code n < 0}
    */
    public UF(int n) {
        count = n;
        parent = new int[n];
        rank = new byte[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    /**
     * Returns the component identifier for the component containing site {@code p}.
     *
     * @param  p the integer representing one site
     * @return the component identifier for the component containing site {@code p}
     * @throws IllegalArgumentException unless {@code 0 <= p < n}
    */
    public int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];    // path compression by halving
            p = parent[p];
        }
        return p;
    }

    /**
     * Returns the number of components.
     *
     * @return the number of components (between {@code 1} and {@code n})
    */
    public int count() {
        return count;
    }
  
    /**
     * Returns true if the the two sites are in the same component.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @return {@code true} if the two sites {@code p} and {@code q} are in the same component;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
    */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
  
    /**
     * Merges the component containing site {@code p} with the 
     * the component containing site {@code q}.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
    */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make root of smaller rank point to root of larger rank
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }
	
}