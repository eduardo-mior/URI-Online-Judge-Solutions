package Iniciante;

/*
 
 QUESTÃO
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a 
 preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
 combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 
 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa 
 de 1 a 4) deve ser solicitado um novo código (até que seja válido). O 
 programa será encerrado quando o código informado for o número 4.
 
 ENTRADA
 A entrada contém apenas valores inteiros e positivos.
 
 SAÍDA
 Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
 que abasteceram cada tipo de combustível, conforme exemplo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1134 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			tipo = leitor.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = leitor.nextInt();
			}
			switch (tipo) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
    }
	
}