package main
 
import (
    "fmt"
)
 
func main() {
    var inicio, final int

    fmt.Scanf("%d", &inicio)
    fmt.Scanf("%d", &final)

    if (inicio >= 0 && final <= 2) {
        fmt.Println("nova")
    } else if (final > inicio && final <= 96) {
        fmt.Println("crescente")
    } else if (inicio >= final && final <= 96) {
        fmt.Println("minguante")
    } else { 
        fmt.Println("cheia")
    }
}