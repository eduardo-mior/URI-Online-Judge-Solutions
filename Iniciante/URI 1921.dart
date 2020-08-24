import 'dart:io';

void main() {
  double N = double.parse(stdin.readLineSync());
  double resposta = (N * (N - 3)) / 2;
  print(resposta.toStringAsFixed(0));
}