var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var L = parseInt(lines.shift());
var C = parseInt(lines.shift());
var lajes1 = (L * C) + ((L - 1) * (C - 1));
var lajes2 = ((L - 1) * 2) + ((C - 1) * 2);  
 
console.log(lajes1);
console.log(lajes2);