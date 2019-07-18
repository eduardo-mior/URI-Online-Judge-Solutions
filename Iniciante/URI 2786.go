package main
 
import (
    "fmt"
)
 
func main() {
    var L, C, lajes1, lajes2 int
 
    fmt.Scanf("%d", &L)
    fmt.Scanf("%d", &C)
    lajes1 = (L * C) + ((L - 1) * (C - 1))
    lajes2 = ((L - 1) * 2) + ((C - 1) * 2)
    fmt.Println(lajes1)
    fmt.Println(lajes2)
}