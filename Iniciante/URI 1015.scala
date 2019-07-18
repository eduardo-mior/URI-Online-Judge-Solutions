import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val x1 = leitor.nextDouble()
        val y1 = leitor.nextDouble()
        val x2 = leitor.nextDouble()
        val y2 = leitor.nextDouble()
        val distancia = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))
        printf("%.4f\n", distancia)
    }
	
}