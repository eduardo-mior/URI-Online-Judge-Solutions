import 'dart:io';

void main() {
  int x = int.parse(stdin.readLineSync());
  double y = double.parse(stdin.readLineSync());
  double media = x / y;
  print("${media.toStringAsFixed(3) } km/l");
}
