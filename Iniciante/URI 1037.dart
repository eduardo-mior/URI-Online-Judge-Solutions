import 'dart:io';

void main() {
  double valor = double.parse(stdin.readLineSync());
  if (valor >= 0 && valor <= 25) {
    print("Intervalo [0,25]");
  } else if (valor > 25 && valor <= 50) {
    print("Intervalo (25,50]");
  } else if (valor > 50 && valor <= 75) {
    print("Intervalo (50,75]");
  } else if (valor > 75 && valor <= 100) {
    print("Intervalo (75,100]");
  } else {
    print("Fora de intervalo");
  }
}
