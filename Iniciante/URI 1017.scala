import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val tempo = leitor.nextInt()
        val velocidade = leitor.nextInt()
        val kilometros = tempo * velocidade
        val media = kilometros / 12.0
        printf("%.3f\n", media)
    }
	
}