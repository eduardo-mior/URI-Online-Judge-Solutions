#include <stdio.h>
 
int main() { 
    int inicio, final;

    scanf("%d %d", &inicio, &final);
    if (inicio >= 0 && final <= 2) {
        printf("nova\n");
    } else if (final > inicio && final <= 96) {
        printf("crescente\n");
    } else if (inicio >= final && final <= 96) {
        printf("minguante\n");
    } else { 
        printf("cheia\n");
    }
    
    return 0;
}