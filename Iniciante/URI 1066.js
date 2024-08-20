var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valoresImpares = 0;
let valoresPares = 0;
let valoresNegativos = 0;
let valoresPositivos = 0;
for (let i = 0; i < 5; i++) {
    let valor = parseInt(lines.shift());
    if (valor % 2 === 0) {
        valoresPares++;
    } else {
        valoresImpares++;
    } 
    if(valor > 0) {  
        valoresPositivos++;
    } else if(valor < 0) {
        valoresNegativos++;
    }
}

console.log(valoresPares+" valor(es) par(es)");
console.log(valoresImpares+" valor(es) impar(es)");
console.log(valoresPositivos+" valor(es) positivo(s)");
console.log(valoresNegativos+" valor(es) negativo(s)");