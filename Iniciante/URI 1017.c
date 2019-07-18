#include <stdio.h>
 
int main() { 
    double kilometros, media;
    int tempo, velocidade;
	
    scanf("%d %d", &tempo, &velocidade);
    kilometros = tempo * velocidade;
	media = kilometros / 12;
    printf("%.3lf\n", media);

    return 0;
}