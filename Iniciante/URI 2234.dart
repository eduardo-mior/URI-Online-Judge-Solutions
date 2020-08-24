import 'dart:io';

void main() { 
  List<String> input = stdin.readLineSync().split(" ");
  double H = double.parse(input[0]);
  double P = double.parse(input[1]);
  double media = H / P;
  print("${media.toStringAsFixed(2)}");
}