package main
 
import (
    "fmt"
)
 
func main() {
    var cod1, cod2 int
    var valor1, n1, valor2, n2, total float64

    fmt.Scanf("%d", &cod1)
    fmt.Scanf("%f", &n1)
    fmt.Scanf("%f", &valor1)
    fmt.Scanf("%d", &cod2)
    fmt.Scanf("%f", &n2)
    fmt.Scanf("%f", &valor2)
	
    total = (n1 * valor1) + (n2 * valor2)
	
    fmt.Printf("VALOR A PAGAR: R$ %.2f\n", total)
}