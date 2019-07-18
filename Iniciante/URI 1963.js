var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(' ');
var A = parseFloat(line[0]);
var B = parseFloat(line[1]);

var aumento = (B * 100.0 / A) - 100.0;
console.log(aumento.toFixed(2) + '%');