import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val a: Double = sc.nextDouble();
    val b: Double = sc.nextDouble();
    val media: Double = ((3.5 * a) + (7.5 * b)) / 11;

    println(String.format("MEDIA = %.5f", media));
}