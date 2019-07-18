import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val x1: Double = leitor.nextDouble();
    val y1: Double = leitor.nextDouble();
    
    val x2: Double = leitor.nextDouble();
    val y2: Double = leitor.nextDouble();
	
    val distancia: Double = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
    println(String.format("%.4f", distancia));
}