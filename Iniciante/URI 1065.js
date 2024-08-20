var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valoresPares = 0;
for (let i = 0; i < 5; i++) {
    let valor = parseInt(lines.shift());
    if (valor % 2 == 0) {
        valoresPares++
    }
}
console.log(valoresPares + " valores pares")