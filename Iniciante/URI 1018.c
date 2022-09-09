#include <stdio.h>

int main() {

        int notasInseridas, atual;
        int notas1, notas2, notas5, notas10;
        int notas20, notas50, notas100;

        scanf("%d", &notasInseridas);
        scanf("%d%d%d%d", &notas1, &notas2, &notas5, &notas10);
        scanf("%d%d%d", &notas20, &notas50, &notas100);

        atual = notasInseridas;
        notas100 = atual / 100;
        atual -= notas100 * 100;
        notas50 = atual / 50;
        atual -= notas50 * 50;
        notas20 = atual / 20;
        atual -= notas20 * 20;
        notas10 = atual / 10;
        atual -= notas10 * 10;
        notas5 = atual / 5;
        atual -= notas5 * 5;
        notas2 = atual / 2;
        atual -= notas2 * 2;
        notas1 = atual;

        printf("%d\n", notasInseridas);
        printf("%d nota(s) de R$ 100,00\n", notas100);
        printf("%d nota(s) de R$ 50,00\n", notas50);
        printf("%d nota(s) de R$ 20,00\n", notas20);
        printf("%d nota(s) de R$ 10,00\n", notas10);
        printf("%d nota(s) de R$ 5,00\n", notas5 );
        printf("%d nota(s) de R$ 2,00\n", notas2 );
        printf("%d nota(s) de R$ 1,00\n", notas1 );

    return 0;
}
