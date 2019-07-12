import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val funcionarios = leitor.nextInt()
        val horas = leitor.nextInt()
        val valorPorHora = leitor.nextDouble()
        val salario = valorPorHora * horas
        println("NUMBER = " + funcionarios)
        printf("SALARY = U$ %.2f\n", salario)
    }

}