using System; 
 
class URI {
 
    static void Main(string[] args) { 
        int funcionarios = int.Parse(Console.ReadLine());
        int horas = int.Parse(Console.ReadLine());
		double valorPorHora = double.Parse(Console.ReadLine());
		double salario = horas * valorPorHora;
        Console.WriteLine("NUMBER = {0}", funcionarios);
		Console.WriteLine("SALARY = U$ {0:F2}", salario);
    }
    
}