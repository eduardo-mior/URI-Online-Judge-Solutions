import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextInt()
        val b = leitor.nextInt()
        val c = leitor.nextInt()
        val d = leitor.nextInt()
        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            println("Valores aceitos") 
        } else { 
            println("Valores nao aceitos")
        }
    }
    
}