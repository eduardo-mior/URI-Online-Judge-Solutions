var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var meias = parseInt(lines.shift());
console.log(meias + 1);