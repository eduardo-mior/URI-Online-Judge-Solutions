import java.util.Scanner

object Main {
    
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        val c = leitor.nextInt()
        val d = leitor.nextInt()
        val diferenca = a * b - c * d
        println("DIFERENCA = " + diferenca)
    }
    
}