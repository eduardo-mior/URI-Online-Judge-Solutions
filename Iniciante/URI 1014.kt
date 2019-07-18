import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val x: Int = leitor.nextInt();
    val y: Double = leitor.nextDouble();
    val media: Double = x / y;

    println(String.format("%.3f km/l", media));
}