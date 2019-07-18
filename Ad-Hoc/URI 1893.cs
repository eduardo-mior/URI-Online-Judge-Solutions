using System; 
 
class URI {
 
    static void Main(string[] args) { 
        string[] input = Console.ReadLine().Split(' ');
        int inicio = int.Parse(input[0]);
        int final = int.Parse(input[1]);
        if (inicio >= 0 && final <= 2) {
            Console.WriteLine("nova");
        } else if (final > inicio && final <= 96) {
            Console.WriteLine("crescente");
        } else if (inicio >= final && final <= 96) {
            Console.WriteLine("minguante");
        } else { 
            Console.WriteLine("cheia");
        }
    }
    
}