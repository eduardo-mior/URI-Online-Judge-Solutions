using System; 
 
class URI {
    
    static void Main(string[] args) { 
        double salario = double.Parse(Console.ReadLine());
        if (salario >= 0.0 && salario <= 2000.0) {
            Console.WriteLine("Isento");
        } else if (salario > 2000.0 && salario <= 3000.0) {
            Console.WriteLine("R$ {0:F2}", (salario - 2000.0) * 0.08);
        } else if (salario > 3000.0 && salario <= 4500.0) {
            Console.WriteLine("R$ {0:F2}", ((salario - 3000.0)  * 0.18) + 80);
        } else {
            Console.WriteLine("R$ {0:F2}", ((salario - 4500.0) * 0.28) + 350);
        }
    }
    
}