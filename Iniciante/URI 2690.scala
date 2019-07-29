import java.util.Scanner
import scala.util.control.Breaks._

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val N = leitor.nextInt()
        for (i <- 0 to N - 1) {
            var password = nextLine(leitor)
            var crypt = new StringBuilder()
            breakable {
                for (c <- password.toCharArray()) {
                    if (crypt.length == 12) break
                         if (c == 'G' || c == 'Q' || c == 'a' || c == 'k' || c == 'u')             crypt.append('0')
                    else if (c == 'I' || c == 'S' || c == 'b' || c == 'l' || c == 'v')             crypt.append('1')
                    else if (c == 'E' || c == 'O' || c == 'Y' || c == 'c' || c == 'm' || c == 'w') crypt.append('2')
                    else if (c == 'F' || c == 'P' || c == 'Z' || c == 'd' || c == 'n' || c == 'x') crypt.append('3')
                    else if (c == 'J' || c == 'T' || c == 'e' || c == 'o' || c == 'y')             crypt.append('4')
                    else if (c == 'D' || c == 'N' || c == 'X' || c == 'f' || c == 'p' || c == 'z') crypt.append('5')
                    else if (c == 'A' || c == 'K' || c == 'U' || c == 'g' || c == 'q')             crypt.append('6')
                    else if (c == 'C' || c == 'M' || c == 'W' || c == 'h' || c == 'r')             crypt.append('7')
                    else if (c == 'B' || c == 'L' || c == 'V' || c == 'i' || c == 's')             crypt.append('8')
                    else if (c == 'H' || c == 'R' || c == 'j' || c == 't')                         crypt.append('9')
                }
            }
            println(crypt)
        }
    }
    
    def nextLine(leitor:Scanner): String =  {
        var str = ""
        while (str.isEmpty()) 
            str = leitor.nextLine()
        return str
    }
    
}