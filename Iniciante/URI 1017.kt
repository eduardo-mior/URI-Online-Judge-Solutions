import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val tempo: Double = leitor.nextDouble();
    val velocidade: Double = leitor.nextDouble();
    val kilometros: Double = tempo * velocidade;
    val media: Double = kilometros / 12;
    
    println(String.format("%.3f", media)); 
}