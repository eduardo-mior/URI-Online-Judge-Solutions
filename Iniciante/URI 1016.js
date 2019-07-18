var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var km = parseInt(lines.shift());
var minutos = (60 * km) / 30;

console.log(minutos + ' minutos');