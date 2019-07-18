var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var valor1 = parseInt(line[0]);
var valor2 = parseInt(line[1]);
var valor3 = parseInt(line[2]);

if (valor1 > valor2 && valor1 > valor3) {
	console.log(valor1 + ' eh o maior');
} else if (valor2 > valor3) {
	console.log(valor2 + ' eh o maior');
} else {
	console.log(valor3 + ' eh o maior');
}