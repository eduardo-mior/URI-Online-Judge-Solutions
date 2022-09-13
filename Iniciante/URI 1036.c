#include <stdio.h>
#include <math.h>


int main (){


    double  a, b, c, x1, x2;
    double delta;

    scanf("%lf%lf%lf", &a, &b, &c);

    delta = b * b  - 4 * a * c;

    if (a == 0){

        printf("Impossivel calcular\n");

    }

    else{

        if (delta > 0){

            x1 = (-b + pow(delta,0.5))/(2*a);
            x2 = (-b - pow(delta,0.5))/(2*a);
            printf("R1 = %.5lf\n", x1);
            printf("R2 = %.5lf\n", x2);
        }

        else{

            printf("Impossivel calcular\n");


        }
    }
}
