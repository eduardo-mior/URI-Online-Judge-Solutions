#include <iostream>
 
int main() { 
    char nome;
    double salarioFixo, vendas, total;

    scanf("%s %lf %lf", &nome, &salarioFixo, &vendas);
    total = ((vendas * 15) / 100) + salarioFixo;
    printf("TOTAL = R$ %.2f\n", total);

    return 0;
}