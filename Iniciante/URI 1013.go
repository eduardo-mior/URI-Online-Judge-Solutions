package main
 
import (
    "fmt"
)
 
func main() {
    var valor1, valor2, valor3 int

    fmt.Scanf("%d", &valor1)
    fmt.Scanf("%d", &valor2)
    fmt.Scanf("%d", &valor3)

	if (valor1 > valor2 && valor1 > valor3) {
		fmt.Printf("%d eh o maior\n", valor1)
	} else if (valor2 > valor3) {
		fmt.Printf("%d eh o maior\n", valor2)
	} else {
		fmt.Printf("%d eh o maior\n", valor3)
	}
}