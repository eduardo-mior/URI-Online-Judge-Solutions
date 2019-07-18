var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var A = parseFloat(line[0]);
var B = parseFloat(line[1]);
var C = parseFloat(line[2]);
var maior;
var soma;
var triangulo;

if (A > B && A > C) maior = A;
else if (B > C) maior = B;
else maior = C;

if (maior == A) soma = B + C;
else if (maior == B) soma = A + C;
else soma = B + A;

if (soma > maior) triangulo = true;
else triangulo = false;

if (triangulo) {
    var perimetro = A + B + C;
    console.log('Perimetro = ' + perimetro.toFixed(1));
} else {
    var areaTrapezio = ((A + B) * C) / 2;
    console.log('Area = ' + areaTrapezio.toFixed(1));
}