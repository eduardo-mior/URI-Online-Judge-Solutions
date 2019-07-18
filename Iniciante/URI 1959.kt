import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val N: Long = leitor.nextLong();
    val L: Long = leitor.nextLong();
    
    val P: Long = N * L;
    println(P);
}