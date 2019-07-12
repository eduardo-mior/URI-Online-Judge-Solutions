var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line1 = lines.shift().split(' ');
var cod1 = parseInt(line1[0]);
var n1 = parseInt(line1[1]);
var valor1 = parseFloat(line1[2]);

var line2 = lines.shift().split(' ');
var cod2 = parseInt(line2[0]);
var n2 = parseInt(line2[1]);
var valor2 = parseFloat(line2[2]);

var total = (n1 * valor1) + (n2 * valor2);
console.log('VALOR A PAGAR: R$ ' + total.toFixed(2));