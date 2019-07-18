var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
var cont = 0;
while (cont < 6) {
    if (x % 2 == 1) {
        console.log(x);
        cont++;
    }
    x++;
}