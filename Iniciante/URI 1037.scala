import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val valor = leitor.nextDouble()
        if (valor >= 0 && valor <= 25) {
            println("Intervalo [0,25]")
        } else if (valor > 25 && valor <= 50) {
            println("Intervalo (25,50]")
        } else if (valor > 50 && valor <= 75) {
            println("Intervalo (50,75]")
        } else if (valor > 75 && valor <= 100) {
            println("Intervalo (75,100]")
        } else {
            println("Fora de intervalo")
        }
    }
    
}