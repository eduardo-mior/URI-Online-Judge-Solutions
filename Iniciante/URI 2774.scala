import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        while (leitor.hasNext()) {
            val H = leitor.nextInt()
            val M = leitor.nextInt()
            val QT = H * 60 / M
            var avg = 0.0
            var sum = 0.0
            var ans = 0.0
            var x: Array[Double] = new Array[Double](QT)
            for (i <- 0 to QT - 1) {
                x(i) = leitor.nextDouble()
                avg += x(i)
            }
            avg /= (QT).toDouble
            for (i <- 0 to QT - 1) {
                sum += Math.pow(x(i) - avg, 2.0)
            }
            ans = Math.sqrt(sum / (QT - 1).toDouble)
            println(f"$ans%1.5f")
        }
    }
    
}