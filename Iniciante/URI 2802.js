var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseFloat(lines.shift());
var resposta = (Math.pow(N, 4.0) - (6.0 * Math.pow(N, 3.0)) + (23.0 * Math.pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
console.log(resposta.toFixed(0));