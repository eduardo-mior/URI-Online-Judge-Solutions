import 'dart:io';

void main() {
  String nome = stdin.readLineSync();
  double salarioFixo = double.parse(stdin.readLineSync());
  double vendas = double.parse(stdin.readLineSync());
  double total = ((vendas * 15) / 100) + salarioFixo;
  print("TOTAL = R\$ ${total.toStringAsFixed(2)}");
}
