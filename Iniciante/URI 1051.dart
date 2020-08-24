import 'dart:io';

void main() {
  double salario = double.parse(stdin.readLineSync());
  if (salario >= 0.0 && salario <= 2000.0) {
      print("Isento");
  } else if (salario > 2000.0 && salario <= 3000.0) {
      print("R\$ ${((salario - 2000.0) * 0.08).toStringAsFixed(2)}");
  } else if (salario > 3000.0 && salario <= 4500.0) {
      print("R\$ ${(((salario - 3000.0)  * 0.18) + 80).toStringAsFixed(2)}");
  } else {
      print("R\$ ${(((salario - 4500.0) * 0.28) + 350).toStringAsFixed(2)}");
  }
}
