using System; 
 
class URI {
	
	public const double pi = 3.14159;
 
    static void Main(string[] args) { 
        double raio = double.Parse(Console.ReadLine());
        double volume = (4.0 / 3) * pi * Math.Pow(raio, 3.0);
        Console.WriteLine("VOLUME = {0:F3}", volume);
    }
    
}