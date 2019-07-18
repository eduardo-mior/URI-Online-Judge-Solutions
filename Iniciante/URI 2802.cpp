#include <iostream>
#include <cmath>
 
int main() { 
    double N, resposta;

    scanf("%lf", &N);
	resposta = (pow(N, 4.0) - (6.0 * pow(N, 3.0)) + (23.0 * pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
    printf("%.0lf\n", resposta);

    return 0;
}