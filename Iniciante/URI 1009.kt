import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val nome: String = leitor.next();
	val salarioFixo: Double = leitor.nextDouble();
	val vendas: Double = leitor.nextDouble();
	val total: Double = ((vendas * 15) / 100) + salarioFixo;
    
    println(String.format("TOTAL = R$ %.2f" , total));
}