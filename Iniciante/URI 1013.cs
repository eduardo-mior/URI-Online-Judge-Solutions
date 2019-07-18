using System; 
 
class URI {
 
    static void Main(string[] args) { 
		string[] input = Console.ReadLine().Split(' ');
		int valor1 = int.Parse(input[0]);
		int valor2 = int.Parse(input[1]);
		int valor3 = int.Parse(input[2]);
		if (valor1 > valor2 && valor1 > valor3) {
			Console.WriteLine("{0} eh o maior", valor1);
		} else if (valor2 > valor3) {
			Console.WriteLine("{0} eh o maior", valor2);
		} else {
			Console.WriteLine("{0} eh o maior", valor3);
		}
    }
    
}