import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    val hInicial: Int = leitor.nextInt();
    val hFinal: Int = leitor.nextInt();
    if (hInicial > hFinal) { 
        println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
    } else if (hFinal > hInicial) {
        println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
    } else {
        println("O JOGO DUROU 24 HORA(S)");
    }
}