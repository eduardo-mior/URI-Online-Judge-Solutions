import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Double = leitor.nextDouble();
    val b: Double = leitor.nextDouble();
    val c: Double = leitor.nextDouble();
    val media: Double = ((a * 2) + (b * 3) + (c * 5)) / 10;

    println(String.format("MEDIA = %.1f", media));
}