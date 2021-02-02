#include <iostream>
#include <string>
#include <stdio.h>
 
using namespace std;

int verifica(int x){
    string x1 = to_string(x);

    for(int i=0; i< x1.length(); i++){
      for(int j=i+1; j<x1.length(); j++){
          if(x1[i]==x1[j])return 0; 
      }
    }
    return 1;
}

int main() {

  int y, x, cont=0;
 while(scanf("%d %d", &y,&x)!= EOF){
    for(int i=y; i<=x; i++){
        cont+=verifica(i);
    }
    cout << cont << endl;
    cont = 0;
 }
    return 0;
}