import 'dart:io';

void main() {
  List<String> input = stdin.readLineSync().split(" ");
  double x = double.parse(input[0]);
  double y = double.parse(input[1]);
  if (x == 0 && y == 0) {
    print("Origem");
  } else if (x == 0) {
    print("Eixo Y");
  } else if (y == 0) {
    print("Eixo X");
  } else if (y > 0 && x > 0) {
    print("Q1");
  } else if (y > 0 && x < 0) {
    print("Q2");
  } else if (y < 0 && x < 0) {
    print("Q3");
  } else if (y < 0 && x > 0) {
    print("Q4");
  }
}
