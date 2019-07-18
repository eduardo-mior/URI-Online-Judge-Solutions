import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Double = leitor.nextDouble();
    val b: Double = leitor.nextDouble();
    val media: Double = ((3.5 * a) + (7.5 * b)) / 11;

    println(String.format("MEDIA = %.5f", media));
}