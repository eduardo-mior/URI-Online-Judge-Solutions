import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        
        val cod1 = leitor.nextInt()
        val n1 = leitor.nextInt()
        val valor1 = leitor.nextDouble()
		
        val cod2 = leitor.nextInt()
        val n2 = leitor.nextInt()
        val valor2 = leitor.nextDouble()
	
        val total = (n1 * valor1) + (n2 * valor2)
        printf("VALOR A PAGAR: R$ %.2f\n", total)
    }
	
}