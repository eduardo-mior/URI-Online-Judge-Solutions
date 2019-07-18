using System; 
 
class URI {
     
    static void Main(string[] args) { 
        string[] input;
        
        input = Console.ReadLine().Split(' ');
        double x1 = double.Parse(input[0]);
        double y1 = double.Parse(input[1]);
        
        input = Console.ReadLine().Split(' ');
        double x2 = double.Parse(input[0]);
        double y2  = double.Parse(input[1]);
        
        double distancia = Math.Sqrt(Math.Pow((x2 - x1), 2.0) + Math.Pow((y2 - y1), 2.0));
        Console.WriteLine("{0:F4}", distancia);
    }
    
}