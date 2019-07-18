import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val A = leitor.nextDouble()
        val B = leitor.nextDouble()
        val aumento = (B * 100.0 / A) - 100.0
        printf("%.2f%%\n", aumento)
    }
	
}