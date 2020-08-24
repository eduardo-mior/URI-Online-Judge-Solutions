import 'dart:io';

void main() {
  double a = double.parse(stdin.readLineSync());
  double b = double.parse(stdin.readLineSync());
  double media = ((3.5 * a) + (7.5 * b)) / 11;
  print("MEDIA = ${media.toStringAsFixed(5)}");
}