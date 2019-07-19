var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());
var citacao = "LIFE IS NOT A PROBLEM TO BE SOLVED";
console.log(citacao.substring(0, n));