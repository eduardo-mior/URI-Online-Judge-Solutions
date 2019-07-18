import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val funcionarios: Int = leitor.nextInt();
    val horas: Int = leitor.nextInt();
	val valorPorHora: Double = leitor.nextDouble();
	val salario: Double = horas * valorPorHora;
    
    println("NUMBER = " + funcionarios);
    println(String.format("SALARY = U$ %.2f", salario));
}