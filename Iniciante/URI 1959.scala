import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val N = leitor.nextLong()
        val L = leitor.nextLong()
        val P = N * L
        println(P)
    }
	
}