import 'dart:io';
import 'dart:math';

void main() {
  List<String> line1 = stdin.readLineSync().split(" ");
  double x1 = double.parse(line1[0]);
  double y1 = double.parse(line1[1]);

  List<String> line2 = stdin.readLineSync().split(" ");
  double x2 = double.parse(line2[0]);
  double y2 = double.parse(line2[1]);

  double distancia = sqrt(pow((x2 - x1), 2.0) + pow((y2 - y1), 2.0));

  print(distancia.toStringAsFixed(4));
}