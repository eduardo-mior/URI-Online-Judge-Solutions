import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
	val valor1: Int = leitor.nextInt();
	val valor2: Int = leitor.nextInt();
	val valor3: Int = leitor.nextInt();
	if (valor1 > valor2 && valor1 > valor3) {
		println("" + valor1 + " eh o maior");
	} else if (valor2 > valor3) {
		println("" + valor2 + " eh o maior");
	} else {
		println("" + valor3 + " eh o maior");
	}
}