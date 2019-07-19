using System; 
 
class URI {
 
    static void Main(string[] args) { 
        string[] line = Console.ReadLine().Split(' ');
        int e = int.Parse(line[0]);
        int d = int.Parse(line[1]);
        if (e > d) {
            Console.WriteLine("Eu odeio a professora!");
        } else if ((d - e) >= 3) {
            Console.WriteLine("Muito bem! Apresenta antes do Natal!");
        } else if ((e + 2) < 24) {
            Console.WriteLine("Parece o trabalho do meu filho!\nTCC Apresentado!");
        } else {
            Console.WriteLine("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!");
        }
    }
    
}