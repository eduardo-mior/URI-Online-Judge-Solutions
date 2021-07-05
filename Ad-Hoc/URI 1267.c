#include <stdio.h>
#include <stdlib.h>
 
int main() {
   int a,b,c, cont, flag=0, i,j;
   int *vetor;
   
   
   scanf("%d %d", &a,&b);

  while(a && b){
     vetor = malloc (b * a * sizeof (int));
    // PREENCHER
    for(i = 0;i < b; i++){
        for (j = 0; j < a; j++){
            scanf("%d", &vetor[(i*a) + j]);
        }
    }
    // VERIFICAR
    for (j = 0; j < a; j++){
      cont = 0;
	 	  for (i = 0; i < b; i++)if(vetor[(j*b) + i]==1)cont++;
			if (cont == b)flag = 1; 
		}
    // SAÍDA
    if(flag==1)printf("yes\n");
    else printf("no\n");
    
    flag = 0;
      free(vetor);
        scanf("%d %d", &a,&b);   
  }  
    return 0;
}