import 'dart:io';

void main() {
  List<String> input = stdin.readLineSync().split(" ");
  int a = int.parse(input[0]);
  int b = int.parse(input[1]);
  if (b % a != 0 && a % b != 0) {
    print("Nao sao Multiplos");
  } else {
    print("Sao Multiplos");
  }
}
