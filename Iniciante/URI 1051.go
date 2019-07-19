package main
 
import (
    "fmt"
)

func main() {
    var salario float64

    fmt.Scanf("%f", &salario)
    if (salario >= 0.0 && salario <= 2000.0) {
        fmt.Printf("Isento\n")
    } else if (salario > 2000.0 && salario <= 3000.0) {
        fmt.Printf("R$ %.2f\n", (salario - 2000.0) * 0.08)
    } else if (salario > 3000.0 && salario <= 4500.0) {
        fmt.Printf("R$ %.2f\n", ((salario - 3000.0)  * 0.18) + 80)
    } else {
        fmt.Printf("R$ %.2f\n", ((salario - 4500.0) * 0.28) + 350)
    }
}