var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

/**
 * Escreva a sua solução aqui
 * Code your solution here
 * Escriba su solución aquí
 */
 
 let linha = lines.shift().split(' ')
 let A = linha[0]
 let B = linha[1]
 let C = linha[2]
 
if ((A == 0) | (B * B - 4 * A * C < 0)) {
 console.log("Impossivel calcular")
} else {
    let bhaskara = Math.sqrt((B * B) - 4 * A * C);
    let R1 = (-B + bhaskara) / (2 * A);
    let R2 = (-B - bhaskara) / (2 * A);
    console.log("R1 = "+ R1.toFixed(5))
    console.log("R2 = "+ R2.toFixed(5))
}