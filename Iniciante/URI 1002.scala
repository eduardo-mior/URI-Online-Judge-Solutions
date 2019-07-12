import java.util.Scanner

object Main {
    
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val raio = leitor.nextDouble()
        val area = 3.14159 * (raio * raio)
        printf("A=%.4f\n", area)
    }
    
}