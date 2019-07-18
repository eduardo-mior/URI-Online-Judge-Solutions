import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val N = leitor.nextLong()
        val resposta = (N * (N - 3)) / 2
        println(resposta)
    }
	
}