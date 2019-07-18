import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val raio: Double = leitor.nextDouble();
    val area: Double = 3.14159 * (raio * raio);
    
    println(String.format("A=%.4f", area));
}