package main
 
import (
    "fmt"
)
 
func main() {
    var km, minutos int

    fmt.Scanf("%d", &km)
    minutos = (60 * km) / 30
    fmt.Printf("%d minutos\n", minutos)
}