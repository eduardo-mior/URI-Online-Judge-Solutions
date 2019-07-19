import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val salario: Double = leitor.nextDouble();
    if (salario >= 0.0 && salario <= 2000.0) {
        println("Isento");
    } else if (salario > 2000.0 && salario <= 3000.0) {
        println(String.format("R$ %.2f", (salario - 2000.0) * 0.08));
    } else if (salario > 3000.0 && salario <= 4500.0) {
        println(String.format("R$ %.2f", ((salario - 3000.0)  * 0.18) + 80));
    } else {
        println(String.format("R$ %.2f", ((salario - 4500.0) * 0.28) + 350));
    }
}