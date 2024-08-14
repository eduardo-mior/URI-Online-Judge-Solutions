var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valorTotal = parseFloat(lines.shift())
let notas = Math.trunc(valorTotal)
moedas = (valorTotal - notas).toFixed(2) * 100

let notas100 = Math.floor(notas / 100)
notas -= notas100 * 100;

let notas50 = Math.floor(notas / 50)
notas -= notas50 * 50

let notas20 = Math.floor(notas / 20)
notas -= notas20 * 20

let notas10 = Math.floor(notas / 10)
notas -= notas10 * 20

let notas5 = Math.floor(notas / 5)
notas -= notas5 * 5

let notas2 = Math.floor(notas / 2)
notas -= notas2 * 2

let moedas1 = notas
notas -= moedas * 1

let moedas50 = Math.floor(moedas / 50)
moedas -= moedas50 * 50

let moedas25 = Math.floor(moedas / 25)
moedas -= moedas25 * 25

let moedas10 = Math.floor(moedas / 10)
moedas -= moedas10 * 10

let moedas5 = Math.floor(moedas / 5)
moedas -= moedas5 * 5

let moedas01 = moedas

console.log("NOTAS:")
console.log(notas100 + " nota(s) de R$ 100.00")
console.log(notas50 + " nota(s) de R$ 50.00")
console.log(notas20 + " nota(s) de R$ 20.00")
console.log(notas10 + " nota(s) de R$ 10.00")
console.log(notas5 + " nota(s) de R$ 5.00")
console.log(notas2 + " nota(s) de R$ 2.00")
console.log("MOEDAS:")
console.log(moedas1  + " moeda(s) de R$ 1.00")
console.log(moedas50  + " moeda(s) de R$ 0.50")
console.log(moedas25  + " moeda(s) de R$ 0.25")
console.log(moedas10 + " moeda(s) de R$ 0.10")
console.log(moedas5 + " moeda(s) de R$ 0.05")
console.log(moedas01 + " moeda(s) de R$ 0.01")