var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var codigo = parseInt(line[0]);
var quantia = parseInt(line[1]);
var total;

switch (codigo) {
    case 1: total = quantia * 4.00; break;
    case 2: total = quantia * 4.50; break;
    case 3: total = quantia * 5.00; break;
    case 4: total = quantia * 2.00; break;
    case 5: total = quantia * 1.50; break;
    default: total = 0;
}

console.log("Total: R$ " + total.toFixed(2));