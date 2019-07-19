package main
 
import (
    "fmt"
)
 
func main() {
    var a, b, c, d int

    fmt.Scanf("%d", &a)
    fmt.Scanf("%d", &b)
    fmt.Scanf("%d", &c)
    fmt.Scanf("%d", &d)

	if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
		fmt.Println("Valores aceitos"); 
	} else { 
		fmt.Println("Valores nao aceitos");
	}	
}