import java.util.Scanner
import java.util.ArrayList
import java.util.Arrays

object Main {
 
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val q = leitor.nextInt()
        for (i <- 0 to q - 1) {
            var l = leitor.nextInt()
            var grid = Array.ofDim[Int](l + 1, l + 1)
            for (j <- 1 to l) {
			    for (k <- 1 to l) {
					grid(j)(k) = leitor.nextInt()
				}
            }
			var pontos = new ArrayList[Int]()
            for (j <- 1 to l) {
				pontos.addAll(Arrays.asList(100 + j, 100 * l + j, 100 * j + 1, 100 * j + l))
            }
			var area = l * l / 2.0
    		while (pontos.size() > 0) {
    			var ponto = pontos.get(0)
    			pontos.remove(0)
    			var x = ponto / 100
    			var y = ponto % 100
    			if (x > 0 && y > 0 && x <= l && y <= l && grid(x)(y) == 0) {
    				area = area - 0.5
    				grid(x)(y) = -1
        			pontos.addAll(Arrays.asList(ponto - 100, ponto + 100, ponto + 1, ponto - 1))
    			}
    		}
			println(f"$area%1.2f")
        }
    }
    
}