#include <stdio.h>

int main() {

    float cod, qtd, soma;

    scanf ("%f%f", &cod, &qtd);


    if ((cod == 1) && (qtd > 0)){

        soma = qtd * 4.00;
        printf("Total: R$ %.2f\n", soma);

        }


    else {

    if((cod == 2) && (qtd > 0)){

         soma = qtd * 4.50;
         printf("Total: R$ %.2f\n", soma);

           }
        if ((cod == 3) && (qtd > 0)){

        soma = qtd * 5.00;
        printf("Total: R$ %.2f\n", soma);

        }


    else {

    if((cod == 4) && (qtd > 0)){

         soma = qtd * 2.00;
         printf("Total: R$ %.2f\n", soma);

           }

      else {

    if((cod == 5) && (qtd > 0)){

         soma = qtd * 1.50;
         printf("Total: R$ %.2f\n", soma);

           }





    return 0;


                    }

            }
      }
}
