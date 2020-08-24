import 'dart:io';
import 'dart:math';

void main() {
  double N = double.parse(stdin.readLineSync());
  double resposta = (pow(N, 4.0) - (6.0 * pow(N, 3.0)) + (23.0 * pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
  print(resposta.toStringAsFixed(0));
}
