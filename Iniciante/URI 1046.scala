import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val hInicial = leitor.nextInt()
        val hFinal = leitor.nextInt()
        if (hInicial > hFinal) { 
            println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)")
        } else if (hFinal > hInicial) {
            println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)")
        } else {
            println("O JOGO DUROU 24 HORA(S)")
        }
    }
    
}