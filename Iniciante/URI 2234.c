#include <stdio.h>
 
int main() { 
    float H, P, media;

    scanf("%f %f", &H, &P);
	media = H / P;
    printf("%.2f\n", media);

    return 0;
}