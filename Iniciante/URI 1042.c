#include <stdio.h>
#include <math.h>

int main (){

  int a, b, c;

  scanf("%d %d %d", &a, &b, &c);

  if (a <= b && b <= c){
    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", c);
  }
  else{

    if (a <= c && c <= b){
      printf("%d\n", a);
      printf("%d\n", c);
      printf("%d\n", b);
    }
    else{

      if (b <= a && a <= c){
        printf("%d\n", b);
        printf("%d\n", a);
        printf("%d\n", c);
      }
      else{

        if (b <= c && c <= a){
          printf("%d\n", b);
          printf("%d\n", c);
          printf("%d\n", a);
        }
        else{

          if (c <= a && a <= b){
            printf("%d\n", c);
            printf("%d\n", a);
            printf("%d\n", b);
          }
          else{
            if (a == b && b == c){
              printf("%d\n", a);
              printf("%d\n", b);
              printf("%d\n", c);
            }
            else{
              printf("%d\n", c);
              printf("%d\n", b);
              printf("%d\n", a);
            }
          }
        }
      }
    }

}
  printf("\n");
  printf("%d\n", a);
  printf("%d\n", b);
  printf("%d\n", c);
}
