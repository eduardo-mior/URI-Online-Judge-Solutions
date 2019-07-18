package main
 
import (
    "fmt"
)

func main() {
    var H, P, media float64

    fmt.Scanf("%f", &H)
    fmt.Scanf("%f", &P)
    media = H / P
    fmt.Printf("%.2f\n", media)
}