import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val a: Int = sc.nextInt();
    val b: Int = sc.nextInt();
    val c: Int = sc.nextInt();
    val d: Int = sc.nextInt();
    val diferenca: Int = a * b - c * d;

    println("DIFERENCA = " + diferenca);
}