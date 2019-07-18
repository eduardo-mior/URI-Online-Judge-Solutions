var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
var resposta = (N * (N - 3)) / 2;

console.log(resposta);