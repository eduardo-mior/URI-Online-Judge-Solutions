var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valores = []
let valoresPositivos = 0;
while (valores.length < 6) {
    let valor = parseFloat(lines.shift())
    if (valor > 0) {
        valoresPositivos++
    }
    valores.push(valor);
}

console.log(valoresPositivos + " valores positivos")