var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
console.log("LIFE IS NOT A PROBLEM TO BE SOLVED".substring(0, N));