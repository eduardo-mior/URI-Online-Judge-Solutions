import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val x: Double = leitor.nextDouble();
    val y: Double = leitor.nextDouble();
    if (x == 0.0 && y == 0.0) {
        println("Origem");
    } else if (x == 0.0) {
        println("Eixo Y");
    } else if (y == 0.0) {
        println("Eixo X");
    } else if (y > 0 && x > 0) {
        println("Q1");
    } else if (y > 0 && x < 0) {
        println("Q2");
    } else if (y < 0 && x < 0) {
        println("Q3");
    } else if (y < 0 && x > 0) {
        println("Q4");
    }
}