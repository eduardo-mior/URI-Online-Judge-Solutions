import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val raio: Double = sc.nextDouble();
    val area: Double = 3.14159 * (raio * raio);
    
    println(String.format("A=%.4f", area));
}