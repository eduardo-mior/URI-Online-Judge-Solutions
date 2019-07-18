using System; 
 
class URI {
 
    static void Main(string[] args) { 
        string nome = Console.ReadLine();
        double salarioFixo = double.Parse(Console.ReadLine());
        double vendas = double.Parse(Console.ReadLine());
        double total = ((vendas * 15) / 100) + salarioFixo;
        Console.WriteLine("TOTAL = R$ {0:F2}", total);
    }
    
}