#include <stdio.h>
 
int main() { 
    float a, b, media;

    scanf("%f %f", &a, &b);
    media = ((3.5 * a) + (7.5 * b)) / 11;
    printf("MEDIA = %.5f\n", media);

    return 0;
}