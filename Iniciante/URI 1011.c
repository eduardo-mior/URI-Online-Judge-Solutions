#include <stdio.h>
#include <math.h>

#define pi 3.14159 

int main() { 
    double raio, volume;

    scanf("%lf", &raio);
    volume = (4.0 / 3) * pi * pow(raio, 3.0);
    printf("VOLUME = %.3f\n", volume);

    return 0;
}