package main
 
import (
    "fmt"
)
 
func main() {
    var hInicial, hFinal int64

    fmt.Scanf("%d", &hInicial)
    fmt.Scanf("%d", &hFinal)

    if (hInicial > hFinal) { 
        fmt.Printf("O JOGO DUROU %d HORA(S)\n", 24 - (hInicial - hFinal));
    } else if (hFinal > hInicial) {
        fmt.Printf("O JOGO DUROU %d HORA(S)\n", hFinal - hInicial);
    } else {
        fmt.Printf("O JOGO DUROU 24 HORA(S)\n");
    }
}