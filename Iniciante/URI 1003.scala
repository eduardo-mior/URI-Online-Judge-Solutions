import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        val soma = a + b
        println("SOMA = " + soma)
    }
	
}