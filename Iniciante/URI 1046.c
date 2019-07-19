#include <stdio.h>
 
int main() { 
    int hInicial, hFinal;

    scanf("%d %d", &hInicial, &hFinal);
    if (hInicial > hFinal) { 
        printf("O JOGO DUROU %d HORA(S)\n", 24 - (hInicial - hFinal));
    } else if (hFinal > hInicial) {
        printf("O JOGO DUROU %d HORA(S)\n", hFinal - hInicial);
    } else {
        printf("O JOGO DUROU 24 HORA(S)\n");
    }
    
    return 0;
}