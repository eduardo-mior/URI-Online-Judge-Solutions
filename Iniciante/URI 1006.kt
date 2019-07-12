import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val a: Double = sc.nextDouble();
    val b: Double = sc.nextDouble();
    val c: Double = sc.nextDouble();
    val media: Double = ((a * 2) + (b * 3) + (c * 5)) / 10;

    println(String.format("MEDIA = %.1f", media));
}