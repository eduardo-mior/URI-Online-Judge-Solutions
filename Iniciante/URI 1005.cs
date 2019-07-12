using System;

class URI {

    static void Main(string[] args) {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double media = ((3.5 * a) + (7.5 * b)) / 11;
        Console.WriteLine("MEDIA = {0:F5}", media);
    }
    
}