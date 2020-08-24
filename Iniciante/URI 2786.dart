import 'dart:io';

void main() { 
  int L = int.parse(stdin.readLineSync());
  int C = int.parse(stdin.readLineSync());
  int lajes1 = (L * C) + ((L - 1) * (C - 1));
  int lajes2 = ((L - 1) * 2) + ((C - 1) * 2);
  print(lajes1);
  print(lajes2);
}