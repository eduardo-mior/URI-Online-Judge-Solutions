package main
 
import (
    "fmt"
    "math"
)

func main() {
    var N, resposta float64

    fmt.Scanf("%f", &N)
    resposta = (math.Pow(N, 4.0) - (6.0 * math.Pow(N, 3.0)) + (23.0 * math.Pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0
    fmt.Printf("%.0f\n", resposta)
}