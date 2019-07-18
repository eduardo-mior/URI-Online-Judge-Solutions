package main
 
import (
    "fmt"
)
 
func main() {
    var T1, T2, T3, T4, totalTomadas int

    fmt.Scanf("%d", &T1)
    fmt.Scanf("%d", &T2)
    fmt.Scanf("%d", &T3)
    fmt.Scanf("%d", &T4)
	
    totalTomadas = (T1 + T2 + T3 + T4) - 3
	
    fmt.Println(totalTomadas)
}