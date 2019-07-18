import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val H = leitor.nextDouble()
        val P = leitor.nextDouble()
        val media = H / P
        printf("%.2f\n", media)
    }
	
}