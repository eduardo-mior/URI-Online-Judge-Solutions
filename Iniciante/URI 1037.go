package main
 
import (
    "fmt"
)
 
func main() {
    var valor float64

    fmt.Scanf("%f", &valor)
    if (valor >= 0 && valor <= 25) {
        fmt.Println("Intervalo [0,25]")
    } else if (valor > 25 && valor <= 50) {
        fmt.Println("Intervalo (25,50]")
    } else if (valor > 50 && valor <= 75) {
        fmt.Println("Intervalo (50,75]")
    } else if (valor > 75 && valor <= 100) {
        fmt.Println("Intervalo (75,100]")
    } else {
        fmt.Println("Fora de intervalo")
    }
}