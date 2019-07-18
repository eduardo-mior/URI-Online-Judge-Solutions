var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var inicio = parseInt(line[0]);
var final = parseInt(line[1]);

if (inicio >= 0 && final <= 2) {
    console.log('nova');
} else if (final > inicio && final <= 96) {
    console.log('crescente');
} else if (inicio >= final && final <= 96) {
    console.log('minguante');
} else { 
    console.log('cheia');
}