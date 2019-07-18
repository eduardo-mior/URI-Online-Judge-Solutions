import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val x = leitor.nextDouble()
        val y = leitor.nextDouble()
        if (x == 0 && y == 0) {
            println("Origem")
        } else if (x == 0) {
            println("Eixo Y")
        } else if (y == 0) {
            println("Eixo X")
        } else if (y > 0 && x > 0) {
            println("Q1")
        } else if (y > 0 && x < 0) {
            println("Q2")
        } else if (y < 0 && x < 0) {
            println("Q3")
        } else if (y < 0 && x > 0) {
            println("Q4")
        }

    }
    
}