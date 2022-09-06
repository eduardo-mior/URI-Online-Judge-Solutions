#include <stdio.h>

int main () {

  unsigned short int x, ano, mes;
  scanf("%hd", &x);

  ano = x/365;
  x -= (ano*365);

  mes = x/30;
  x -= (mes*30);

  printf("%d ano(s)\n", ano);
  printf("%d mes(es)\n", mes);
  printf("%d dia(s)\n", x);

}