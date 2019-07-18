import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val N: Long = leitor.nextLong();
    val resposta: Long = (N * (N - 3)) / 2;
    println(resposta);
}