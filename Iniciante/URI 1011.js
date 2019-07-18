var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
const pi = 3.14159;

var raio = parseFloat(lines.shift());
var volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);

console.log('VOLUME = ' + volume.toFixed(3));