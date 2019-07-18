using System; 
 
class URI {
     
    static void Main(string[] args) { 
        string[] input = Console.ReadLine().Split(' ');
        double A = double.Parse(input[0]);
        double B = double.Parse(input[1]);
        double aumento = (B * 100.0 / A) - 100.0;
        Console.WriteLine("{0:F2}%", aumento);
    }
    
}