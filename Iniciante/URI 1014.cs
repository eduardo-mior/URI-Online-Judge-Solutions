using System; 
 
class URI {
 
    static void Main(string[] args) { 
        int x = int.Parse(Console.ReadLine());
        double y = double.Parse(Console.ReadLine());
        double media = x / y;
        Console.WriteLine("{0:F3} km/l", media);
    }
    
}