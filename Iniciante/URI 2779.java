package Iniciante;

/*
 
 QUESTÃO
 Em ano de Copa do Mundo de Futebol, o álbum de figurinhas oficial é sempre um 
 grande sucesso entre crianças e também entre adultos. Para quem não conhece, 
 o álbum contém espaços numerados de 1 a N para colar as figurinhas; cada 
 figurinha, também numerada de 1 a N, é uma pequena foto de um jogador de uma 
 das seleções que jogará a Copa do Mundo. O objetivo é colar todas as figurinhas 
 nos respectivos espaços no álbum, de modo a completar o álbum (ou seja, não 
 deixar nenhum espaço sem a correspondente figurinha).

 As figurinhas são vendidas em envelopes fechados, de forma que o comprador não 
 sabe quais fi- gurinhas está comprando, e pode ocorrer de comprar uma figurinha 
 que ele já tenha colado no álbum.

 Para ajudar os usuários, a empresa responsável pela venda do álbum e das 
 figurinhas quer criar um aplicativo que permita gerenciar facilmente as 
 figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.

 Dados o número total de espaços e figurinhas do álbum, e uma lista das 
 figurinhas já compradas (que pode conter figurinhas repetidas), sua tarefa é 
 determinar quantas figurinhas faltam para completar o álbum.

 ENTRADA
 A primeira linha contém um inteiro N (1 <= N <= 100) indicando o número total de 
 figurinhas e espaços no álbum. A segunda linha contém um inteiro M (1 <= M <= 300) 
 indicando o número de figurinhas já compradas. Cada uma das M linhas seguintes 
 contém um número inteiro X (1 <= X <= N) indicando uma figurinha já comprada.
 
 SAÍDA
 Seu programa deve produzir uma única linha contendo um inteiro representando o 
 número de figurinhas que falta para completar o álbum.
 
*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class URI 2779 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int M = leitor.nextInt();
        HashSet<Integer> compradas = new HashSet<Integer>();
        for (int i = 0; i < M; i++) {
        	compradas.add(leitor.nextInt());
        }
        int faltam = N - compradas.size();
        System.out.println(faltam);
    }
	
}