#include <stdio.h>
 
int main() { 
    int T1, T2, T3, T4, totalTomadas;

    scanf("%d %d %d %d", &T1, &T2, &T3, &T4);
    totalTomadas = (T1 + T2 + T3 + T4) - 3;
    printf("%d\n", totalTomadas);

    return 0;
}