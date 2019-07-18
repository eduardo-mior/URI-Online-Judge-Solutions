#include <stdio.h>
 
int main() { 
    int km, minutos;
	
    scanf("%d", &km);
    minutos = (60 * km) / 30;
    printf("%d minutos\n", minutos);

    return 0;
}