var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var a = parseFloat(lines.shift());
var b = parseFloat(lines.shift());
var media = ((3.5 * a) + (7.5 * b)) / 11;
   
console.log('MEDIA = ' + media.toFixed(5));