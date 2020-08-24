import 'dart:io';

void main() {
  int idadeDias = int.parse(stdin.readLineSync());
  int anos = idadeDias ~/ 365;
  idadeDias -= anos * 365;
  int meses = idadeDias ~/ 30;
  idadeDias -= meses * 30;
  int dias = idadeDias;
  print("$anos ano(s)");
  print("$meses mes(es)");
  print("$dias dia(s)");
}