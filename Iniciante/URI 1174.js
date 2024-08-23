var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


let numbers = []
for(let i = 0; i <= 100; i++) {
    let x = parseFloat(lines.shift())
    numbers.push(x)
}
for (let i = 0; i <= numbers.length; i++) {
    if (numbers[i] <= 10) {
        console.log("A["+i+"] = "+numbers[i].toFixed(1))
    }
}