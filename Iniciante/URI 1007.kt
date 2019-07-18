import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Int = leitor.nextInt();
    val b: Int = leitor.nextInt();
    val c: Int = leitor.nextInt();
    val d: Int = leitor.nextInt();
    val diferenca: Int = a * b - c * d;

    println("DIFERENCA = " + diferenca);
}