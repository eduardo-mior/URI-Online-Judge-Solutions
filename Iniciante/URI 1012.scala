import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
		
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()
		
		val triangulo = a * c / 2.0
		val circulo = 3.14159 * (c * c)
		val trapezio = ((a + b) * c) / 2.0
		val quadrado = b * b
		val retangulo = a * b
		
        printf("TRIANGULO: %.3f\n", triangulo)
        printf("CIRCULO: %.3f\n", circulo)
        printf("TRAPEZIO: %.3f\n", trapezio)
        printf("QUADRADO: %.3f\n", quadrado)
        printf("RETANGULO: %.3f\n", retangulo)
    }
	
}