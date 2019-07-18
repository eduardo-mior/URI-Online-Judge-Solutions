using System;

class URI {
 
    static void Main(string[] args) { 
        int L = int.Parse(Console.ReadLine());
        int C = int.Parse(Console.ReadLine());
        int lajes1 = (L * C) + ((L - 1) * (C - 1));
        int lajes2 = ((L - 1) * 2) + ((C - 1) * 2);
        Console.WriteLine(lajes1);
        Console.WriteLine(lajes2);
    }
    
}