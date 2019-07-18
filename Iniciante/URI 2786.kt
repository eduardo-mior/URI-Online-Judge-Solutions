import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val L: Int = leitor.nextInt();
    val C: Int = leitor.nextInt();
    val lajes1: Int = (L * C) + ((L - 1) * (C - 1));
    val lajes2: Int = ((L - 1) * 2) + ((C - 1) * 2);
    
    println(lajes1);
    println(lajes2);
}