var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var funcionarios = parseInt(lines.shift());
var horas = parseInt(lines.shift());
var valorPorHora = parseFloat(lines.shift());
var salario = horas * valorPorHora;

console.log("NUMBER = " + funcionarios);
console.log("SALARY = U$ " + salario.toFixed(2));