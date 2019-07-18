import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val km: Int = leitor.nextInt();
    val minutos: Int = (60 * km) / 30;
    
    println(minutos + " minutos");
}