import java.util.Scanner

object Main {
    
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        while (leitor.hasNext()) {
            val N = leitor.nextInt()
            val I = leitor.nextInt()
            var cont = 0
            for (k <- 0 to N - 1) {
                val i = leitor.nextInt()
                val j = leitor.nextInt()
                if (i == I && j == 0) cont += 1
            }
            println(cont)
        }
    }
    
}