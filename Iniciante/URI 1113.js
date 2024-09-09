var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let numerosIguais = false;
while (numerosIguais != true) {
    let linhas = lines.shift().split(' ')
    let n1 = parseInt(linhas[0])
    let n2 = parseInt(linhas[1])
    if (n1 == n2) {
        numerosIguais = true
    } else {
        if (n1 > n2) {
            console.log('Decrescente')
        }else {
            console.log('Crescente')
        }
    }
}