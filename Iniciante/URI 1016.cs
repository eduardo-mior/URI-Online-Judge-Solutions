using System; 
 
class URI {
 
    static void Main(string[] args) { 
        int km = int.Parse(Console.ReadLine());
        int minutos = (60 * km) / 30;
        Console.WriteLine("{0} minutos", minutos);
    }
    
}