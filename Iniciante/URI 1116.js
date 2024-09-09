var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let N = parseInt(lines.shift())

for(let i = 0; i < N; i++) {
    let numbers = lines.shift().split(' ')
    if (parseInt(numbers[1]) == 0) {
        console.log('divisao impossivel')
    } else {
        let calc = parseInt(numbers[0]) / parseInt(numbers[1])
        console.log(calc.toFixed(1))
    }
}