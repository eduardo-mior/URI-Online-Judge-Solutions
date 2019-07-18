import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Int = leitor.nextInt();
    val b: Int = leitor.nextInt();
    val soma: Int = a + b;
    
    println("SOMA = " + soma);
}