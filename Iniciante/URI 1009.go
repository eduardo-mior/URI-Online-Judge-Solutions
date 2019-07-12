package main
 
import (
    "fmt"
)
 
func main() {
    var nome string
    var salarioFixo, vendas, total float64

    fmt.Scanf("%s", &nome)
    fmt.Scanf("%f", &salarioFixo)
    fmt.Scanf("%f", &vendas)

    total = ((vendas * 15) / 100) + salarioFixo

    fmt.Printf("TOTAL = R$ %.2f\n", total)
}