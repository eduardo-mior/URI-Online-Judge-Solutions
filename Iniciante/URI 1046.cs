using System; 
 
class URI {
 
    static void Main(string[] args) { 
        string[] line = Console.ReadLine().Split(' ');
        int hInicial = int.Parse(line[0]);
        int hFinal = int.Parse(line[1]);
        if (hInicial > hFinal) { 
            Console.WriteLine("O JOGO DUROU {0} HORA(S)", 24 - (hInicial - hFinal));
        } else if (hFinal > hInicial) {
            Console.WriteLine("O JOGO DUROU {0} HORA(S)", hFinal - hInicial);
        } else {
            Console.WriteLine("O JOGO DUROU 24 HORA(S)");
        }
    }
    
}