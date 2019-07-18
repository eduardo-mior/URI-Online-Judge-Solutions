using System; 
 
class URI {
 
    static void Main(string[] args) {
		string[] input = Console.ReadLine().Split(' ');
        int T1 = int.Parse(input[0]);
        int T2 = int.Parse(input[1]);
        int T3 = int.Parse(input[2]);
        int T4 = int.Parse(input[3]);

        int totalTomadas = (T1 + T2 + T3 + T4) - 3;
        Console.WriteLine(totalTomadas);
    }
    
}