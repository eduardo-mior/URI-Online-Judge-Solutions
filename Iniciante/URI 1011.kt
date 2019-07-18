import java.util.Scanner;

val pi: Double = 3.14159;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val raio: Double = leitor.nextDouble();
    val volume: Double = (4.0 / 3) * pi * Math.pow(raio, 3.0);
    
    println(String.format("VOLUME = %.3f", volume));
}