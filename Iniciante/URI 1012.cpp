#include <iostream>
 
int main() { 
    float a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

    scanf("%f %f %f", &a, &b, &c);
	
    triangulo = a * c / 2.0;
    circulo = 3.14159 * (c * c);
    trapezio = ((a + b) * c) / 2.0;
    quadrado = b * b;
    retangulo = a * b;
	
    printf("TRIANGULO: %.3f\n", triangulo);
    printf("CIRCULO: %.3f\n", circulo);
    printf("TRAPEZIO: %.3f\n", trapezio);
    printf("QUADRADO: %.3f\n", quadrado);
    printf("RETANGULO: %.3f\n", retangulo);
	
    return 0;
}