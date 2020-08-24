import 'dart:io';

void main() {
  List<String> line = stdin.readLineSync().split(" ");
  double a = double.parse(line[0]);
  double b = double.parse(line[1]);
  double c = double.parse(line[2]);
  double triangulo = a * c / 2.0;
  double circulo = 3.14159 * (c * c);
  double trapezio = ((a + b) * c) / 2;
  double quadrado = b * b;
  double retangulo = a * b;
  print("TRIANGULO: ${triangulo.toStringAsFixed(3)}");
  print("CIRCULO: ${circulo.toStringAsFixed(3)}");
  print("TRAPEZIO: ${trapezio.toStringAsFixed(3)}");
  print("QUADRADO: ${quadrado.toStringAsFixed(3)}");
  print("RETANGULO: ${retangulo.toStringAsFixed(3)}");
}
