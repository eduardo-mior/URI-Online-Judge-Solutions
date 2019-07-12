#include <stdio.h>
 
int main() { 
	int funcionarios, horas;
    float valorPorHora, salario;

    scanf("%d %d %f", &funcionarios, &horas, &valorPorHora);
    salario = horas * valorPorHora;
	printf("NUMBER = %d\n", funcionarios);
    printf("SALARY = U$ %.2f\n", salario);

    return 0;
}