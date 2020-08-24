import 'dart:io';

void main() { 
  List<String> input = stdin.readLineSync().split(" ");
  double A = double.parse(input[0]);
  double B = double.parse(input[1]);
  double aumento = (B * 100.0 / A) - 100.0;
  print("${aumento.toStringAsFixed(2)}%");
}