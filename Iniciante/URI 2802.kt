import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val N: Double = leitor.nextDouble();
    val resposta: Double = (Math.pow(N, 4.0) - (6.0 * Math.pow(N, 3.0)) + (23.0 * Math.pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
    println(String.format("%.0f", resposta));
}