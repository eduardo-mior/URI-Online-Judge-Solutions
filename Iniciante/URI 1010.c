#include <stdio.h>
 
int main() { 
    int cod1, cod2, n1, n2;
    float valor1, valor2, total;

    scanf("%d %d %f", &cod1, &n1, &valor1);
    scanf("%d %d %f", &cod2, &n2, &valor2);
    total = (n1 * valor1) + (n2 * valor2);
    printf("VALOR A PAGAR: R$ %.2f\n", total);

    return 0;
}