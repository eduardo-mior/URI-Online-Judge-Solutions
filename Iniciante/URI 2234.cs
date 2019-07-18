using System; 
 
class URI {
     
    static void Main(string[] args) { 
        string[] input = Console.ReadLine().Split(' ');
        double H = double.Parse(input[0]);
        double P = double.Parse(input[1]);
        double media = H / P;
        Console.WriteLine("{0:F2}", media);
    }
    
}