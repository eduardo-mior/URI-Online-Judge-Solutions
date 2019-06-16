package Iniciante;

/*
 
 QUESTÃO
 Está chegando a grande final do Campeonato Nlogonense de Surf Aquático, que 
 este ano ocorrerá na cidade de Bonita Horeleninha (BH)! Antes de viajar para 
 BH, você e seus N-1 amigos decidiram combinar algum dia para ir a uma 
 pizzaria, para relaxar e descontrair (e, naturalmente, comer!).

 Neste momento está sendo escolhida a data do evento. Para que todas as 
 pessoas possam participar, foi decidido que o encontro na pizzaria ocorrerá 
 em um data tal que todas as N pessoas podem comparecer à pizzaria nesta data. 
 Portanto, nem toda data pode ser escolhida, pois algumas pessoas podem ter 
 outros compromissos já marcados em alguns dias.

 Dada a lista de datas consideradas para o evento e a informações de quais 
 pessoas podem comparecer em quais datas, determine se o evento poderá ocorrer 
 e, em caso positivo, sua data. Caso mais de uma data seja possível, o evento 
 deve ocorrer o mais cedo possível.
  
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 os inteiros N e D (1 <= N, D <= 50), o número de pessoas e o número de datas 
 consideradas, respectivamente. As pessoas são numeradas de 1 a N. As próximas 
 D linhas descrevem uma data considerada. Cada linha começa com a data na 
 forma dia/mes/ano. A linha é seguida de N inteiros p1,p2,...,pN. O inteiro pi 
 é 1 se a pessoa i pode comparecer na data considerada, ou 0 caso contrário. É 
 garantido que as datas são sempre válidas, e não há zeros à esquerda. Além 
 disso, as datas são dadas em ordem, do dia mais cedo para o dia mais tarde.

 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima uma linha contendo a data que o evento deve 
 ocorrer, na forma dia/mes/ano, de maneira idêntica à da entrada. Caso não seja 
 possível realizar o evento, imprima “Pizza antes de FdI” (sem aspas).
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2554 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int N = leitor.nextInt();
			int D = leitor.nextInt();
			String oficialDate = "Pizza antes de FdI";
			boolean swp = true;
			for (int i = 0; i < D; i++) {
				String date = leitor.next();
				boolean bol = true;
				for (int j = 0; j < N; j++) {
					if (leitor.nextInt() != 1)
						bol = false;
				}
				if (bol && swp) {
					swp = false;
					oficialDate = date;
				}
			}
			System.out.println(oficialDate.trim());
		}
	}
	
}