package main
 
import (
    "fmt"
)
 
func main() {
    var a, b, media float64

    fmt.Scanf("%f", &a)
    fmt.Scanf("%f", &b)
    media = ((3.5 * a) + (7.5 * b)) / 11
    fmt.Printf("MEDIA = %.5f\n", media)
}