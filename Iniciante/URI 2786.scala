import java.util.Scanner

object Main {

    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val L = leitor.nextInt()
        val C = leitor.nextInt()
        val lajes1 = (L * C) + ((L - 1) * (C - 1))
        val lajes2 = ((L - 1) * 2) + ((C - 1) * 2)
        println(lajes1)
        println(lajes2)
    }
	
}