package main
 
import (
    "fmt"
)

func main() {
    var N, L, P int64

    fmt.Scanf("%d", &N)
    fmt.Scanf("%d", &L)
    P = N * L
    fmt.Println(P)
}