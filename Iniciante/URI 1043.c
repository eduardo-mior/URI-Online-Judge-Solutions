#include <stdio.h>

int main ()
{

  float a, b, c, area, perimetro;
  scanf("%f %f %f", &a, &b, &c);

  if ((b - c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a - b) < c && c < (a + b)){

    perimetro = a + b + c;
    printf("Perimetro = %.1f\n", perimetro);

  }
  else{

    area = ((a + b)*c)/2.0;
    printf("Area = %.1f\n", area);

  }
}
