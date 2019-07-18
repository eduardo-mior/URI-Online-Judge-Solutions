#include <iostream>

int main() { 
    float A, B, aumento;

    scanf("%f %f", &A, &B);
	aumento = (B * 100.0 / A) - 100.0;
    printf("%.2f%%\n", aumento);

    return 0;
}