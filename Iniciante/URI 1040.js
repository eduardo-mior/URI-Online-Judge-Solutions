var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

/**
 * Escreva a sua solução aqui
 * Code your solution here
 * Escriba su solución aquí
 */
let linhas = lines.shift().split(' ')
let notaA = parseFloat(linhas[0])
let notaB = parseFloat(linhas[1])
let notaC = parseFloat(linhas[2])
let notaD = parseFloat(linhas[3])
let media = ((notaA * 2) + (notaB * 3) + (notaC * 4) + (notaD * 1)) / 10
console.log("Media: "+media.toFixed(1))
if (media >= 7) {
    console.log("Aluno aprovado.")
} else if (media < 7 && media >= 5) {
    let exame = parseFloat(lines.shift())
    media = (media + exame) / 2
    console.log("Aluno em exame.")
    console.log("Nota do exame: "+exame.toFixed(1))
    if (media >= 5.0) {
        console.log("Aluno aprovado.")
    } else {
        console.log("Aluno reprovado.")
    }
    console.log("Media final: "+ media.toFixed(1))
} else {
    console.log("Aluno reprovado.")
}