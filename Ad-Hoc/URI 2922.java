package Ad-Hoc;

/*
 
 QUESTÃO
 O professor de programação Barroquinha adora passar questões do URI para seus 
 alunos, porém o professor Umbujahyba mudou a senha da rede e esqueceu de passar 
 para Barroquinha.

 Como Barroquinha não enxerga muito bem os numeros das salas, ele pediu para você 
 desenvolver um algoritmo que calcula quantas portas ele deve passar para chegar 
 na sala de Umbujahyba.
 
 ENTRADA
 A entrada contém 2 valores inteiros B(0 <= B <= 150) e U (1 <= U <= 150), com a 
 sala de Barroquinha e Umbujahyba e termina em EOF
 
 SAÍDA
 Imprima a quantidade de salas que Barroquinha deve passar para chegar na sala de Umbujahyba.

 */

import java.io.IOException;
import java.util.Scanner;

public class URI 2922 {

    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (leitor.hasNext()) {
    		int a = leitor.nextInt();
    		int b = leitor.nextInt();
    		if (a > b) {
    			int aux = a;
    			a = b;
    			b = aux;
    		}
    		if (a == b)
    			System.out.println(b - a);
    		else
    			System.out.println(b - a - 1);
    	}
    }
    
}