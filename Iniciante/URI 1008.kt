import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    
    val funcionarios: Int = sc.nextInt();
    val horas: Int = sc.nextInt();
	val valorPorHora: Double = sc.nextDouble();
	val salario: Double = horas * valorPorHora;
    
    println("NUMBER = " + funcionarios);
    println(String.format("SALARY = U$ %.2f", salario));
}