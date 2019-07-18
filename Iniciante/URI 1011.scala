import java.util.Scanner

object Main {
    
    private final val pi = 3.14159

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val raio = leitor.nextDouble()
        val volume = (4.0 / 3) * pi * Math.pow(raio, 3.0)
        printf("VOLUME = %.3f\n", volume)
    }
	
}