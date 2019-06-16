package Iniciante;

/*
 
 QUESTÃO
 A Associação dos Primos Indivisíveis elegeu uma categoria de números primos 
 chamados de Super Primos. Um número é considerado super primo se além de 
 ser primo, todos os seus dígitos são primos, também. A Associação lhe 
 solicitou que fizesse um programa para caracterizar os números.
 
 ENTRADA
 A entrada contém vários casos de testes, cada caso de teste é um número 
 inteiro N (0 < N < 105) em uma linha única. A entrada termina no último 
 caso de teste.
 
 SAÍDA
 Para cada caso de teste espera-se, em um linha única, a classificação do 
 número da entrada, que pode ser: "Super", se o número for Super Primo; 
 "Primo" se o número por um número primo apenas; ou "Nada" se o número 
 possuir divisores além do 1 e ele mesmo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2674 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int N = leitor.nextInt();
            if (isPrime(N)) {
            	if (isSuperPrime(N)) 
            		System.out.println("Super");
            	else
            		System.out.println("Primo");
            } else {
            	System.out.println("Nada");
            }
        }
    }
    
    private static boolean isPrime(int n) {
    	if (n == 1 || n == 0) return false;
    	for (int i = 2; i < n; i++) 
    		if (n % i == 0) return false;
    	return true;
    }
    
    private static boolean isSuperPrime(int n) {
    	String number = String.valueOf(n);
    	for (int i = 0; i < number.length(); i++)
    		if (!isPrime(Integer.valueOf(String.valueOf(number.charAt(i)))))
    			return false;
    	return true;
    }
	
}