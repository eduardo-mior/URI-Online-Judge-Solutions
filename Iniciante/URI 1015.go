package main
 
import (
    "fmt"
    "math"
)

func main() {
    var x1, y1, x2, y2, distancia float64

    fmt.Scanf("%f", &x1)
    fmt.Scanf("%f", &y1)
    fmt.Scanf("%f", &x2)
    fmt.Scanf("%f", &y2)
    distancia = math.Sqrt(math.Pow((x2 - x1), 2.0) + math.Pow((y2 - y1), 2.0))
    fmt.Printf("%.4f\n", distancia)
}