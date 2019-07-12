using System;

class URI {

    static void Main(string[] args) {
        double raio = double.Parse(Console.ReadLine());
        double area = 3.14159 * (raio * raio);
        Console.WriteLine("A={0:F4}", area);
    }
    
}