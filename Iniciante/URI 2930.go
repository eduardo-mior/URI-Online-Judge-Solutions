package main
 
import (
    "fmt"
)
 
func main() {
    var e, d int64

    fmt.Scanf("%d", &e)
    fmt.Scanf("%d", &d)

	if (e > d) {
		fmt.Println("Eu odeio a professora!")
	} else if ((d - e) >= 3) {
		fmt.Println("Muito bem! Apresenta antes do Natal!")
	} else if ((e + 2) < 24) {
		fmt.Println("Parece o trabalho do meu filho!\nTCC Apresentado!")
	} else {
		fmt.Println("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!")
	}
}