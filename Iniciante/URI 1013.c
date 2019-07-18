#include <stdio.h>
 
int main() { 
    int valor1, valor2, valor3;

    scanf("%d %d %d", &valor1, &valor2, &valor3);
	if (valor1 > valor2 && valor1 > valor3) {
		printf("%d eh o maior\n", valor1);
	} else if (valor2 > valor3) {
		printf("%d eh o maior\n", valor2);
	} else {
		printf("%d eh o maior\n", valor3);
	}
	
    return 0;
}