#include <stdio.h>
#include <math.h>
 
int main() { 
    float x1, x2, y1, y2, distancia;

    scanf("%f %f %f %f", &x1, &y1, &x2, &y2);
	distancia = sqrt(pow((x2 - x1), 2.0) + pow((y2 - y1), 2.0));
    printf("%.4f\n", distancia);

    return 0;
}