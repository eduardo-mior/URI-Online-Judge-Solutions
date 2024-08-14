var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let duracaoSegundos = parseInt(lines.shift());

let horas = Math.floor(duracaoSegundos / 3600);
duracaoSegundos -= horas * 3600;
let minutos = Math.floor(duracaoSegundos / 60);
duracaoSegundos -= minutos * 60;
let segundos = duracaoSegundos;

console.log(horas + ":"+minutos+":"+segundos);