import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val T1: Int = leitor.nextInt();
    val T2: Int = leitor.nextInt();
    val T3: Int = leitor.nextInt();
    val T4: Int = leitor.nextInt();
	
    val totalTomadas: Int = (T1 + T2 + T3 + T4) - 3;
    println(totalTomadas);
}