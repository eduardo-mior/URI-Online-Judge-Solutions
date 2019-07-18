package main
 
import (
    "fmt"
)
 
func main() {
    var x, y, media float64

    fmt.Scanf("%f", &x)
    fmt.Scanf("%f", &y)
    media = x / y
    fmt.Printf("%.3f km/l\n", media)
}