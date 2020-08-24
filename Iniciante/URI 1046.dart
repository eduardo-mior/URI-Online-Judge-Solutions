import 'dart:io';

void main() {
  List<String> input = stdin.readLineSync().split(" ");
  int hInicial = int.parse(input[0]);
  int hFinal = int.parse(input[1]);
  if (hInicial > hFinal) { 
      print("O JOGO DUROU ${24 - (hInicial - hFinal)} HORA(S)");
  } else if (hFinal > hInicial) {
      print("O JOGO DUROU ${hFinal - hInicial} HORA(S)");
  } else {
      print("O JOGO DUROU 24 HORA(S)");
  }
}
