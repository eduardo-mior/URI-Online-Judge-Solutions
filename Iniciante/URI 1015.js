var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line1 = lines.shift().split(' ');
var x1 = parseFloat(line1[0]);
var y1 = parseFloat(line1[1]);

var line2 = lines.shift().split(' ');
var x2 = parseFloat(line2[0]);
var y2 = parseFloat(line2[1]);

var distancia = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
console.log(distancia.toFixed(4));