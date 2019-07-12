import java.util.Scanner

object Main {
    
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val c = leitor.nextDouble()
        val media = ((a * 2) + (b * 3) + (c * 5)) / 10
        printf("MEDIA = %.1f\n", media)
    }
    
}