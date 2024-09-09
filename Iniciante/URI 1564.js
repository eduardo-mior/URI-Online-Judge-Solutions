var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let number = lines.shift()
while (lines.length != 0) {
    if (number == 0) {
        console.log("vai ter copa!")
    } else {
        console.log("vai ter duas!")
    }
    number = lines.shift()
}