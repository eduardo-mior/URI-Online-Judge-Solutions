import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val T1 = leitor.nextInt()
        val T2 = leitor.nextInt()
        val T3 = leitor.nextInt()
        val T4 = leitor.nextInt()
        val totalTomadas = (T1 + T2 + T3 + T4) - 3
        println(totalTomadas)
    }
	
}