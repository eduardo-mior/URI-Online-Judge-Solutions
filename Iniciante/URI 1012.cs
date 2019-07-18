using System; 
 
class URI {
 
    static void Main(string[] args) { 
		string[] line = Console.ReadLine().Split(' ');
        double a = double.Parse(line[0]);
        double b = double.Parse(line[1]);
        double c = double.Parse(line[2]);
		
		double triangulo = a * c / 2.0;
		double circulo = 3.14159 * (c * c);
		double trapezio = ((a + b) * c) / 2.0;
		double quadrado = b * b;
		double retangulo = a * b;
		
        Console.WriteLine("TRIANGULO: {0:F3}", triangulo);
        Console.WriteLine("CIRCULO: {0:F3}", circulo);
        Console.WriteLine("TRAPEZIO: {0:F3}", trapezio);
        Console.WriteLine("QUADRADO: {0:F3}", quadrado);
        Console.WriteLine("RETANGULO: {0:F3}", retangulo);
    }
    
}