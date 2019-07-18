package main
 
import (
    "fmt"
)
 
func main() {
    var x, y float64

    fmt.Scanf("%f", &x)
    fmt.Scanf("%f", &y)

    if (x == 0 && y == 0) {
        fmt.Println("Origem")
    } else if (x == 0) {
        fmt.Println("Eixo Y")
    } else if (y == 0) {
        fmt.Println("Eixo X")
    } else if (y > 0 && x > 0) {
        fmt.Println("Q1")
    } else if (y > 0 && x < 0) {
        fmt.Println("Q2")
    } else if (y < 0 && x < 0) {
        fmt.Println("Q3")
    } else if (y < 0 && x > 0) {
        fmt.Println("Q4")
    }
}