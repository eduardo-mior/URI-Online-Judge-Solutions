import java.util.Scanner

object Main {
 
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val C = leitor.nextShort()
        for (i <- 0 until C) {
            val n1 = leitor.nextShort()
            val op = leitor.next().charAt(0)
            val n2 = leitor.nextShort()
            leitor.next()
            val respostaDada = leitor.nextShort()
            var resposta = 0
            if (op == '+') {
                resposta = n1 + n2
            } else if (op == '-') {
                resposta = n1 - n2
            } else if (op == 'x') {
                resposta = n1 * n2
            }
            resposta = Math.abs(respostaDada - resposta)
            var faustao = new StringBuilder("E")
            for (j <- 0 until resposta) {
                faustao.append('r')
            }
            faustao.append("ou!")
            println(faustao)
        }
    }
    
}