import 'dart:io';

void main() { 
  List<String> input = stdin.readLineSync().split(" ");
  int inicio = int.parse(input[0]);
  int finau = int.parse(input[1]);
  if (inicio >= 0 && finau <= 2) {
      print("nova");
  } else if (finau > inicio && finau <= 96) {
      print("crescente");
  } else if (inicio >= finau && finau <= 96) {
      print("minguante");
  } else { 
      print("cheia");
  }
}