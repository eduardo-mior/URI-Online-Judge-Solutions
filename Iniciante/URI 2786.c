#include <stdio.h>
 
int main() { 
    int L, C, lajes1, lajes2;

    scanf("%d %d", &L, &C);
    lajes1 = (L * C) + ((L - 1) * (C - 1));
    lajes2 = ((L - 1) * 2) + ((C - 1) * 2);
    printf("%d\n", lajes1);
    printf("%d\n", lajes2);

    return 0;
}