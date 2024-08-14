var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let idadeDias = parseInt(lines.shift());


let anos = Math.floor(idadeDias / 365);
console.log(anos + " ano(s)");
idadeDias -= anos * 365;
let meses = Math.floor(idadeDias / 30);
console.log(meses + " mes(es)");
idadeDias -= meses * 30;
let dias = Math.floor(idadeDias);
console.log(dias+ " dia(s)");