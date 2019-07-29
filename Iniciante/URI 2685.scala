import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        while (leitor.hasNext()) {
            val graus = leitor.nextInt()
            if (graus < 90) println("Bom Dia!!")
            else if (graus < 180) println("Boa Tarde!!")
            else if (graus < 270) println("Boa Noite!!")
            else if (graus < 360) println("De Madrugada!!")
            else println("Bom Dia!!")
        }
    }
    
}