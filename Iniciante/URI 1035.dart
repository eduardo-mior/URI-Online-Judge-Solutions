import 'dart:io';

void main() {
  List<String> input = stdin.readLineSync().split(" ");
  int a = int.parse(input[0]);
  int b = int.parse(input[1]);
  int c = int.parse(input[2]);
  int d = int.parse(input[3]);
  if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
    print("Valores aceitos");
  } else {
    print("Valores nao aceitos");
  }
}