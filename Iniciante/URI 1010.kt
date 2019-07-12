import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val cod1: Int = sc.nextInt();
    val n1: Int = sc.nextInt();
    val valor1: Double = sc.nextDouble();
    
    val cod2: Int = sc.nextInt();
    val n2: Int = sc.nextInt();
    val valor2: Double = sc.nextDouble();
	
    val total: Double = (n1 * valor1) + (n2 * valor2);
    println(String.format("VALOR A PAGAR: R$ %.2f", total));
}