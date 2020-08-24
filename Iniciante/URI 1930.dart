import 'dart:io';

void main() {
  List<String> input = stdin.readLineSync().split(" ");
  int T1 = int.parse(input[0]);
  int T2 = int.parse(input[1]);
  int T3 = int.parse(input[2]);
  int T4 = int.parse(input[3]);

  int totalTomadas = (T1 + T2 + T3 + T4) - 3;
  print(totalTomadas);
}
