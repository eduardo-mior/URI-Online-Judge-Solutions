import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Int = leitor.nextInt();
    val b: Int = leitor.nextInt();
    val c: Int = leitor.nextInt();
    val d: Int = leitor.nextInt();
    
    if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
        println("Valores aceitos"); 
    } else { 
        println("Valores nao aceitos");
    }
}