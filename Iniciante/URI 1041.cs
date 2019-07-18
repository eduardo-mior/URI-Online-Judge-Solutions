using System; 
 
class URI {
 
    static void Main(string[] args) { 
        string[] line = Console.ReadLine().Split(' ');
        double x = double.Parse(line[0]);
        double y = double.Parse(line[1]);
        if (x == 0 && y == 0) {
            Console.WriteLine("Origem");
        } else if (x == 0) {
            Console.WriteLine("Eixo Y");
        } else if (y == 0) {
            Console.WriteLine("Eixo X");
        } else if (y > 0 && x > 0) {
            Console.WriteLine("Q1");
        } else if (y > 0 && x < 0) {
            Console.WriteLine("Q2");
        } else if (y < 0 && x < 0) {
            Console.WriteLine("Q3");
        } else if (y < 0 && x > 0) {
            Console.WriteLine("Q4");
        }
    }
    
}