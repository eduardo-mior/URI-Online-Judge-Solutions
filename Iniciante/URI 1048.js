var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let salarioFuncionario = parseFloat(lines.shift())
let reajusteSalario = 0
let porcentagem
if (salarioFuncionario >= 0 && salarioFuncionario <= 400) {
    reajusteSalario = salarioFuncionario * 0.15
    porcentagem = 15
} else if (salarioFuncionario > 400 && salarioFuncionario <= 800) {
    reajusteSalario = salarioFuncionario * 0.12
    porcentagem = 12
} else if (salarioFuncionario > 800 && salarioFuncionario <= 1200) {
    reajusteSalario = salarioFuncionario * 0.10
    porcentagem = 10
} else if (salarioFuncionario > 1200 && salarioFuncionario <= 2000) {
    reajusteSalario = salarioFuncionario * 0.07
    porcentagem = 7
} else {
    reajusteSalario = salarioFuncionario * 0.04
    porcentagem = 4
}
console.log(`Novo salario: `+ (salarioFuncionario + reajusteSalario).toFixed(2))
console.log(`Reajuste ganho: `+ reajusteSalario.toFixed(2))
console.log(`Em percentual: ${porcentagem} %`)