package main
 
import (
    "fmt"
)
 
func main() {
    var funcionarios int
    var horas, valorPorHora, salario float64

    fmt.Scanf("%d", &funcionarios)
    fmt.Scanf("%f", &horas)
    fmt.Scanf("%f", &valorPorHora)
    salario = valorPorHora * horas
    fmt.Printf("NUMBER = %d\n", funcionarios)
    fmt.Printf("SALARY = U$ %.2f\n", salario)
}