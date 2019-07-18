package main
 
import (
    "fmt"
)
 
func main() {
    var a, b, c, triangulo, circulo, trapezio, quadrado, retangulo float64

    fmt.Scanf("%f", &a)
    fmt.Scanf("%f", &b)
    fmt.Scanf("%f", &c)

    triangulo = a * c / 2.0
    circulo = 3.14159 * (c * c)
    trapezio = ((a + b) * c) / 2.0
    quadrado = b * b
    retangulo = a * b
	
    fmt.Printf("TRIANGULO: %.3f\n", triangulo)
    fmt.Printf("CIRCULO: %.3f\n", circulo)
    fmt.Printf("TRAPEZIO: %.3f\n", trapezio)
    fmt.Printf("QUADRADO: %.3f\n", quadrado)
    fmt.Printf("RETANGULO: %.3f\n", retangulo)
}