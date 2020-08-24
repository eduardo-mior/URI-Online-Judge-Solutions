import 'dart:io';

void main() {
  int km = int.parse(stdin.readLineSync());
  double minutos = (60 * km) / 30;
  print(minutos.toStringAsFixed(0) + " minutos");
}
