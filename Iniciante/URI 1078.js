var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var n = parseInt(lines.shift());
console.log('1 x ' + n + ' = ' + (n * 1));
console.log('2 x ' + n + ' = ' + (n * 2));
console.log('3 x ' + n + ' = ' + (n * 3));
console.log('4 x ' + n + ' = ' + (n * 4));
console.log('5 x ' + n + ' = ' + (n * 5));
console.log('6 x ' + n + ' = ' + (n * 6));
console.log('7 x ' + n + ' = ' + (n * 7));
console.log('8 x ' + n + ' = ' + (n * 8));
console.log('9 x ' + n + ' = ' + (n * 9));
console.log('10 x ' + n + ' = ' + (n * 10));