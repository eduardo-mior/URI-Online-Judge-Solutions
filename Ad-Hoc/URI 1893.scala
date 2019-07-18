import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val inicio = leitor.nextInt()
        val finau = leitor.nextInt()
        if (inicio >= 0 && finau <= 2) {
            println("nova")
        } else if (finau > inicio && finau <= 96) {
            println("crescente")
        } else if (inicio >= finau && finau <= 96) {
            println("minguante")
        } else { 
            println("cheia")
        }
    }
    
}