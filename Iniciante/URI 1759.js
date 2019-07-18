var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
for (let i = 1; i <= N; i++) {
    if (i == N) console.log('Ho!');
    else process.stdout.write('Ho ');
}