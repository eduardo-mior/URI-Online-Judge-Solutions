import java.util.Scanner

object Main {
    
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val a = leitor.nextDouble()
        val b = leitor.nextDouble()
        val media = ((3.5 * a) + (7.5 * b)) / 11
        printf("MEDIA = %.5f\n", media)
    }
    
}