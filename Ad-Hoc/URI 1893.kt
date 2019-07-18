import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val inicio: Int = leitor.nextInt();
    val final: Int = leitor.nextInt();
    if (inicio >= 0 && final <= 2) {
        println("nova");
    } else if (final > inicio && final <= 96) {
        println("crescente");
    } else if (inicio >= final && final <= 96) {
        println("minguante");
    } else { 
        println("cheia");
    }
}