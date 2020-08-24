import 'dart:io';

void main() {
  double raio = double.parse(stdin.readLineSync());
  double area = 3.14159 * (raio * raio);
  print("A=" + area.toStringAsFixed(4));
}