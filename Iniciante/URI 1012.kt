import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Double = leitor.nextDouble();
    val b: Double = leitor.nextDouble();
    val c: Double = leitor.nextDouble();

	val triangulo: Double = a * c / 2.0;
	val circulo: Double = 3.14159 * (c * c);
	val trapezio: Double = ((a + b) * c) / 2.0;
	val quadrado: Double = b * b;
	val retangulo: Double = a * b;
    
	println(String.format("TRIANGULO: %.3f", triangulo));
	println(String.format("CIRCULO: %.3f", circulo));
	println(String.format("TRAPEZIO: %.3f", trapezio));
	println(String.format("QUADRADO: %.3f", quadrado));
	println(String.format("RETANGULO: %.3f", retangulo)); 
}