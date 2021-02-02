#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
void reverse(char *str){
    int i =0;
    int j = strlen(str) - 1;
    char aux;
    while(i<j){
        aux = str[i];
        str[i] = str[j];
        str[j] = aux;
        i++;
        j--;
    }
}
int main(void) {
    char string[10000];
    unsigned long int entrada;
    int j=0;
    
    scanf("%lu", &entrada);
    
    for(long int i=0; i<entrada; i++){
      scanf(" %[^\n]", string);
      int tam = strlen(string);
      while(j < tam){
          if((string[j]<=90 && string[j]>=65) || (string[j]<=122 && string[j]>=97))
                string[j]+=3;
          if(tam%2!=0 && j <= (tam/2))string[j]-=1;
          else if (j < (tam/2)){
            string[j]-=1;
          }
          j++;
      }
      string[j]='\0';
      reverse(string);
        printf("%s\n", string);
      string[j=0]='\0';
    }
    
    return 0;
}