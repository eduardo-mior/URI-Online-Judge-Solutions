var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
 
let valoresParaLer = parseInt(lines.shift());
let a = 0;
let b = 0;
for (let x = 0; x < valoresParaLer; x++ ){
    let valor = parseInt(lines.shift());
    if (valor >= 10 && valor <= 20) {
        a++;
    } else {
        b++;
    }
}
console.log(a+ " in");
console.log(b+ " out");