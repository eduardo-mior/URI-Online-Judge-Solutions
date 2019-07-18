var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var A = parseInt(line[0]);
var B = parseInt(line[1]);

if (A % B == 0 || B % A == 0) 
    console.log('Sao Multiplos');
else 
    console.log('Nao sao Multiplos');