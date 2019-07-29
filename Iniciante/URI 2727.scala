import java.util.Scanner

object Main {
 
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        while (leitor.hasNext()) {
            val N = leitor.nextInt()
            for (i <- 0 to N - 1) {
                var str = nextLine(leitor)
                var codigo = str.split(" ")
                var letra = (96 + (((codigo.length - 1) * 3) + codigo(0).length())).toChar
                println(letra)
            }
        }
    }
    
    def nextLine(leitor:Scanner): String =  {
        var str = ""
        while (str.isEmpty()) 
            str = leitor.nextLine()
        return str
    }
    
}