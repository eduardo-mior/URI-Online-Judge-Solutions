import 'dart:io';

void main() {
  List<String> line1 = stdin.readLineSync().split(" ");
  int cod1 = int.parse(line1[0]);
  int n1 = int.parse(line1[1]);
  double valor1 = double.parse(line1[2]);

  List<String> line2 = stdin.readLineSync().split(" ");
  int cod2 = int.parse(line2[0]);
  int n2 = int.parse(line2[1]);
  double valor2 = double.parse(line2[2]);

  double total = (n1 * valor1) + (n2 * valor2);
  print("VALOR A PAGAR: R\$ ${total.toStringAsFixed(2)}");
}