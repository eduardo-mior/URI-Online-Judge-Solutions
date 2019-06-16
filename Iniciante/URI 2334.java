package Iniciante;

/*
 
 QUESTÃO
 Cinco patinhos foram passear. Além das montanhas. Para brincar. A mamãe 
 gritou: quá, quá, quá, quá. Mas só quatro patinhos voltaram de lá. Quatro 
 patinhos foram passear. Além das montanhas. Para brincar. A mamãe gritou: 
 quá, quá, quá, quá. Mas só três patinhos voltaram de lá. Três patinhos 
 foram passear. Além das montanhas. Para brincar. A mamãe gritou: quá, quá, 
 quá, quá. Mas só dois patinhos voltaram de lá. Dois patinhos foram passear. 
 Além das montanhas. Para brincar. A mamãe gritou: quá, quá, quá, quá. Mas só 
 um patinho voltou de lá. Um patinho foi passear. Além das montanhas. Para 
 brincar. A mamãe gritou: quá, quá, quá, quá. Mas nenhum patinho voltou de lá.

 A mamãe patinha ficou tão triste naquele dia que resolveu pedir sua ajuda 
 para procurar além das montanhas, na beira do mar, quantos patinhos não voltaram de lá.
 
 ENTRADA
 Haverá vários casos de testes, a primeira linha de cada caso de teste contém 
 um inteiro (0 <= P <= 1019) representando a quantidade total de patos, a entrada 
 termina com P = -1.

 SÁIDA
 O arquivo de saída deve conter a quantidade de patinhos que retornaram.

*/

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class URI 2334 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		BigInteger br = new BigInteger("-1"); 
        BigInteger sub = new BigInteger("1");
		while (true) {
			BigInteger N = leitor.nextBigInteger();
			if (N.compareTo(br) == 0) break;
			System.out.println(N.compareTo(BigInteger.ZERO) == 0 ? 0 : N.subtract(sub));
		}
	}
	
}