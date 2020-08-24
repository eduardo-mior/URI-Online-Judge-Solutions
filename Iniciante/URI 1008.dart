import 'dart:io';

void main() {
  int funcionarios = int.parse(stdin.readLineSync());
  int horas = int.parse(stdin.readLineSync());
  double valorPorHora = double.parse(stdin.readLineSync());
  double salario = horas * valorPorHora;
  print("NUMBER = $funcionarios");
  print("SALARY = U\$ ${salario.toStringAsFixed(2)}");
}
