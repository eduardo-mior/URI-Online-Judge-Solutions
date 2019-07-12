package main
 
import (
    "fmt"
)
 
func main() {
    var a, b, prod int
 
    fmt.Scanf("%d", &a)
    fmt.Scanf("%d", &b)
    prod = a * b
    fmt.Printf("PROD = %d\n", prod)
}