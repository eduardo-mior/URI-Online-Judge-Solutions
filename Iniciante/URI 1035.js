var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var A = parseInt(line[0]);
var B = parseInt(line[1]);
var C = parseInt(line[2]);
var D = parseInt(line[3]);

if ((B > C) && (D > A) && ((C+D) > (A+B)) && (C > 0) && (D > 0) && (A % 2 == 0)) console.log('Valores aceitos'); 
else console.log('Valores nao aceitos');