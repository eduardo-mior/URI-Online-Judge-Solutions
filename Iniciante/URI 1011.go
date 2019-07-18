package main
 
import (
    "fmt"
    "math"
)

const pi = 3.14159

func main() {
    var raio, volume float64

    fmt.Scanf("%f", &raio)
    volume = (4.0 / 3) * pi * math.Pow(raio, 3.0)
    fmt.Printf("VOLUME = %.3f\n", volume)
}