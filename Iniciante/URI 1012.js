var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(' ');
var a = parseFloat(line[0]);
var b = parseFloat(line[1]);
var c = parseFloat(line[2]);

var triangulo = a * c / 2.0;
var circulo = 3.14159 * (c * c);
var trapezio = ((a + b) * c) / 2;
var quadrado = b * b;
var retangulo = a * b;

console.log('TRIANGULO: ' + triangulo.toFixed(3));
console.log('CIRCULO: ' + circulo.toFixed(3));
console.log('TRAPEZIO: ' + trapezio.toFixed(3));
console.log('QUADRADO: ' + quadrado.toFixed(3));
console.log('RETANGULO: ' + retangulo.toFixed(3));