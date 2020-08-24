import 'dart:io';
import 'dart:math';

const double pi = 3.14159;

void main() {
  double raio = double.parse(stdin.readLineSync());
  double volume = (4.0 / 3) * pi * pow(raio, 3.0);
  print("VOLUME = ${volume.toStringAsFixed(3)}");
}
