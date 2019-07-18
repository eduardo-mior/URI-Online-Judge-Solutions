import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val cod1: Int = leitor.nextInt();
    val n1: Int = leitor.nextInt();
    val valor1: Double = leitor.nextDouble();
    
    val cod2: Int = leitor.nextInt();
    val n2: Int = leitor.nextInt();
    val valor2: Double = leitor.nextDouble();
	
    val total: Double = (n1 * valor1) + (n2 * valor2);
    println(String.format("VALOR A PAGAR: R$ %.2f", total));
}