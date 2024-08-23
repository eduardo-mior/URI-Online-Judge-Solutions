var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let X = parseInt(lines.shift())
let valores = []
for (let i = 0; i < X; i++) {
    let valor = parseInt(lines.shift())
    valores.push(valor)
}
for (let i = 0; i < valores.length; i++) {
    if (valores[i] == 0) {
        console.log("NULL")
    } else if (valores[i] % 2 == 0 && valores[i] > 0) {
        console.log("EVEN POSITIVE")
    } else if (valores[i] % 2 == 0 && valores[i] < 0) {
        console.log("EVEN NEGATIVE")
    } else if (valores[i] % 2 != 0 && valores[i] > 0) {
        console.log("ODD POSITIVE")
    } else if (valores[i] % 2 != 0 && valores[i] < 0) {
        console.log("ODD NEGATIVE")
    }
}