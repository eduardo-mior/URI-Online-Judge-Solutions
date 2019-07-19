import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val e = leitor.nextInt();
        val d = leitor.nextInt();
        if (e > d) {
            println("Eu odeio a professora!");
        } else if ((d - e) >= 3) {
            println("Muito bem! Apresenta antes do Natal!");
        } else if ((e + 2) < 24) {
            println("Parece o trabalho do meu filho!\nTCC Apresentado!");
        } else {
            println("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!");
        }
    }
    
}