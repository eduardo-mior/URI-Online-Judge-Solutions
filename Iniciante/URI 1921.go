package main
 
import (
    "fmt"
)
 
func main() {
    var N, resposta uint64

    fmt.Scanf("%d", &N)
    resposta = (N * (N - 3)) / 2
    fmt.Println(resposta)
}