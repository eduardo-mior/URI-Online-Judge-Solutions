import java.util.Scanner

object Main {
 
    def main(args: Array[String]) {
        val leitor = new Scanner(System.in)
        val N = leitor.nextInt()
        var casaComprado = 0
        var casaSobrando = 0
        var trabComprado = 0
        var trabSobrando = 0
        for (i <- 0 to N - 1) {
            var irProTrabalho = leitor.next()
            var irPraCasa = leitor.next()
            if (irProTrabalho.equalsIgnoreCase("chuva") && casaSobrando == 0) {
                casaComprado += 1
                trabSobrando += 1
            } else if (irProTrabalho.equalsIgnoreCase("chuva") && casaSobrando > 0) {
                trabSobrando += 1
                casaSobrando -= 1
            }
            if (irPraCasa.equalsIgnoreCase("chuva") && trabSobrando == 0) {
                trabComprado += 1
                casaSobrando += 1
            } else if (irPraCasa.equalsIgnoreCase("chuva") && trabSobrando > 0) {
                casaSobrando += 1
                trabSobrando -= 1
            }
        }
        println(casaComprado + " " + trabComprado)
    }
    
}