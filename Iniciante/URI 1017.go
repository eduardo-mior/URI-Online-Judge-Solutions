package main
 
import (
    "fmt"
)
 
func main() {
    var tempo, velocidade, kilometros, media float64

    fmt.Scanf("%f", &tempo)
    fmt.Scanf("%f", &velocidade)
    kilometros = tempo * velocidade
    media = kilometros / 12
    fmt.Printf("%.3f\n", media)
}