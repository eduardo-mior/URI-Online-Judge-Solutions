import 'dart:io';

void main() {
  double tempo = double.parse(stdin.readLineSync());
  double velocidade = double.parse(stdin.readLineSync());
  double kilometros = tempo * velocidade;
  double media = kilometros / 12;
  print(media.toStringAsFixed(3));
}
