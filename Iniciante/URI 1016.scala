import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val km = leitor.nextInt()
        val minutos = (60 * km) / 30
        println(minutos + " minutos")
    }
	
}