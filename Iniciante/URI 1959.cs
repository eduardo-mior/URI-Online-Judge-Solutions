using System; 
 
class URI {
     
    static void Main(string[] args) { 
        string[] input = Console.ReadLine().Split(' ');
        long N = long.Parse(input[0]);
        long L = long.Parse(input[1]);
        long P = N * L;
        Console.WriteLine("{0}", P);
    }
    
}