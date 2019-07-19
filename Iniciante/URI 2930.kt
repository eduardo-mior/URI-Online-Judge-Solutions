import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val e: Int = leitor.nextInt();
    val d: Int = leitor.nextInt();
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