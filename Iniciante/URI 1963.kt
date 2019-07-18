import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val A: Double = leitor.nextDouble();
    val B: Double = leitor.nextDouble();
    
    val aumento: Double = (B * 100.0 / A) - 100.0;
    println(String.format("%.2f%%", aumento));
}