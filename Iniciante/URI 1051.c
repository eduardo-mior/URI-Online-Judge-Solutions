#include <stdio.h>

int main() { 
    float salario;

    scanf("%f", &salario);
    if (salario >= 0.0 && salario <= 2000.0) {
        printf("Isento\n");
    } else if (salario > 2000.0 && salario <= 3000.0) {
        printf("R$ %.2f\n", (salario - 2000.0) * 0.08);
    } else if (salario > 3000.0 && salario <= 4500.0) {
        printf("R$ %.2f\n", ((salario - 3000.0)  * 0.18) + 80);
    } else {
        printf("R$ %.2f\n", ((salario - 4500.0) * 0.28) + 350);
    }

    return 0;
}