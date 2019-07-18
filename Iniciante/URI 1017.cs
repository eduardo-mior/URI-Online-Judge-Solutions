using System;

class URI {
 
    static void Main(string[] args) { 
        int tempo = int.Parse(Console.ReadLine());
        int velocidade = int.Parse(Console.ReadLine());
        double kilometros = tempo * velocidade;
		double media = kilometros / 12;
        Console.WriteLine("{0:F3}", media);
    }
    
}