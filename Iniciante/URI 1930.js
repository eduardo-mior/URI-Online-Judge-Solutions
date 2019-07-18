var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(' ');
var T1 = parseInt(line[0]);
var T2 = parseInt(line[1]);
var T3 = parseInt(line[2]);
var T4 = parseInt(line[3]);

var totalTomadas = (T1 + T2 + T3 + T4) - 3;
console.log(totalTomadas);