import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val a: Int = leitor.nextInt();
    val b: Int = leitor.nextInt();
    if (a % b == 0 || b % a == 0) {
        println("Sao Multiplos");
    } else {
        println("Nao sao Multiplos");
    }
}