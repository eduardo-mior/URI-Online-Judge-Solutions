package main
 
import (
    "fmt"
)

func main() {
    var A, B, aumento float64

    fmt.Scanf("%f", &A)
    fmt.Scanf("%f", &B)
    aumento = (B * 100.0 / A) - 100.0
    fmt.Printf("%.2f%%\n", aumento)
}