var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(' ');
var N = parseFloat(line[0]);
var L = parseFloat(line[1]);

var P = N * L;
console.log(P);