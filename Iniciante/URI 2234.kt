import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val H: Double = leitor.nextDouble();
    val P: Double = leitor.nextDouble();
    
    val media: Double = H / P;
    println(String.format("%.2f", media));
}