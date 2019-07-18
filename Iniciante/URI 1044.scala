import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        if (a % b == 0 || b % a == 0) {
            println("Sao Multiplos")
        } else {
            println("Nao sao Multiplos")
        }
    }
    
}