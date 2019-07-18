var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(' ');
var H = parseFloat(line[0]);
var P = parseFloat(line[1]);

var media = H / P;
console.log(media.toFixed(2));