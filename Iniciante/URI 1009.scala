import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val nome = leitor.next()
        val salarioFixo = leitor.nextDouble()
        val vendas = leitor.nextDouble()
        val total = ((vendas * 15) / 100) + salarioFixo
		printf("TOTAL = R$ %.2f\n", total)
    }
	
}