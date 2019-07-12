import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val nome: String = sc.next();
	val salarioFixo: Double = sc.nextDouble();
	val vendas: Double = sc.nextDouble();
	val total: Double = ((vendas * 15) / 100) + salarioFixo;
    
    println(String.format("TOTAL = R$ %.2f" , total));
}