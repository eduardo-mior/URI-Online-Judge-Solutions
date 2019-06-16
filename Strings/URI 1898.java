package Strings;

/*

 QUESTÃO
 A agência gaúcha para investigações criminais denominada OBI (Operação de Baita 
 Investigação) notou que, a exemplo do que ocorreu na Petrobrás, muito dinheiro 
 foi desviado dos cofres públicos do estado para pagamento de propina a políticos 
 nos últimos anos, especialmente pelo partido QU (Quadrilha Unida).

 A investigação está em andamento e a agência recrutou você para converter alguns 
 valores que ficaram com caracteres estranhos após terem sidos descriptografados 
 dos arquivos originais. Sua tarefa neste caso é relativamente simples: basta 
 retirar todos os caracteres estranhos (não numéricos) de cada um dos dois valores 
 disponíveis e somar estes valores. Apenas tome o cuidado de separar da soma os 
 primeiros 11 dígitos do primeiro valor. Eles correspondem ao CPF do corrupto :)

 ENTRADA
 A entrada é composta por duas linhas, cada uma delas contendo entre 1 e 60 
 caracteres ('0'-'9' e outros caracteres não numéricos ou, pelo menos, 1 caracter 
 '0'-'9') e no máximo um ponto ".". Desconsiderando os caracteres não numéricos, o 
 número final não deve ter mais de 17 caracteres (incluindo o ponto decimal).
 Qualquer número após a segunda casa decimal deve ser descartado.

 SAÍDA
 Imprima o CPF do corrupto, conforme apresentado abaixo e soma dos valores que 
 foram desviados dos cofres públicos, sempre com duas casas decimais.

*/

import java.io.IOException;
import java.util.Scanner;
 
public class URI 1898{
 
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		String cpf = "";
		String valor1 = leitor.next().replaceAll("[^\\d.]", "");
		String valor2 = leitor.next().replaceAll("[^\\d.]", "");
		
		if (valor1.length()  <= 11) {
			cpf = valor1;
			valor1 = "";
		} else {
			cpf = valor1.substring(0, 11);
			valor1 = valor1.substring(11, valor1.length());
		}
		
		if (valor1.contains(".")) {
			int index = valor1.indexOf(".");
			String numerosDepoisDoPonto = valor1.substring(index, valor1.length());
			if (numerosDepoisDoPonto.length() > 3) {
				valor1 = valor1.substring(0, index + 3);
			}
		}
		
		if (valor2.contains(".")) {
			int index = valor2.indexOf(".");
			String numerosDepoisDoPonto = valor2.substring(index, valor2.length());
			if (numerosDepoisDoPonto.length() > 3) {
				valor2 = valor2.substring(0, index + 3);
			}
		}
		
		double v1 = 0;
		if (!valor1.isEmpty()) {
			v1 = Double.parseDouble(valor1);
		}
		double v2 = Double.parseDouble(valor2);
		 
		double total = v1 + v2;
		
		System.out.println("cpf " + cpf);
		System.out.println(String.format("%.2f", total));
    }
 
}