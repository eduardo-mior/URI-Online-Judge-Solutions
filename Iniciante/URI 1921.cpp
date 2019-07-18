#include <iostream>
 
int main() { 
    long long N, resposta;

    scanf("%lli", &N);
    resposta = (N * (N - 3)) / 2;
    printf("%lli\n", resposta);

    return 0;
}