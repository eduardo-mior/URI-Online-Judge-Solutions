var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var E = parseFloat(line[0]);
var D = parseFloat(line[1]);

if (E > D) {
    console.log('Eu odeio a professora!');
} else if ((D - E) >= 3) {
    console.log('Muito bem! Apresenta antes do Natal!');
} else if ((E + 2) < 24) {
    console.log('Parece o trabalho do meu filho!\nTCC Apresentado!');
} else {
    console.log('Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!');
}