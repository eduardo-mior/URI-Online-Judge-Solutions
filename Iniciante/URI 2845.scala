import java.util.Scanner
import java.util.Arrays
import scala.util.control.Breaks._

object Main {
 
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val N = leitor.nextInt()
        var A: Array[Int] = new Array[Int](N)
        for (i <- 0 to N - 1) {
			A(i) = leitor.nextInt()
        }
		Arrays.sort(A)
		if (A.length == 1 && A(0) == 1) {
			println(2)
			return
		}
		breakable {
			for (i <- A(A.length-1) to 999999999) {
				var bol = true
				breakable {
					for (j <- A) {
						if (mdc(j, i) != 1) {
							bol = false
							break
						}
					}
				}
				if (bol) {
					println(i)
					break
				}
			}
		}
    }
	
	def mdc(a:Int, b:Int): Int = {
        if (a == 0) 
        	return b
        return mdc(b % a, a)
    }
    
}