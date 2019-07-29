import java.util.Scanner
import scala.util.control.Breaks._

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextInt()
        var cont = 0
        var res = 0
        breakable {
            for (i <- 4 to 999999999) {
                if (cont == a) {
                    break
                }
                if (!isFib(i)) {
                    cont += 1
                    res = i
                }
            }
        }
        println(res)
    }
        
    def square(x:Long): Boolean = {
        var s = Math.sqrt(x).toLong
        return s * s == x
    }
    
    def isFib(c:Long): Boolean = {
        return square(5 * c * c + 4) || square(5 * c * c - 4)
    }
    
}