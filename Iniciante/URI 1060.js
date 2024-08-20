var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valoresPositivos = 0;
for (let i = 0; i < 6; i++) {
    let valor = parseFloat(lines.shift());
    if (valor > 0) {
     valoresPositivos++   
    }
}
console.log(valoresPositivos+ " valores positivos")
