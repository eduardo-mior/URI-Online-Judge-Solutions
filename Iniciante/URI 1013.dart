import 'dart:io';

void main() {
  List<String> line = stdin.readLineSync().split(" ");
  int valor1 = int.parse(line[0]);
  int valor2 = int.parse(line[1]);
  int valor3 = int.parse(line[2]);
  if (valor1 > valor2 && valor1 > valor3) {
    print("$valor1 eh o maior");
  } else if (valor2 > valor3) {
    print("$valor2 eh o maior");
  } else {
    print("$valor3 eh o maior");
  }
}
