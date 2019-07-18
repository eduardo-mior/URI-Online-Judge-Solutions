var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var line = lines.shift().split(" ");
var hInicio = parseInt(line[0]);
var mInicio = parseInt(line[1]);
var hFim = parseInt(line[2]);
var mFim = parseInt(line[3]);
var totalH = hFim - hInicio;
var totalM = mFim - mInicio;

if (totalH < 0) {
    totalH = 24 + (hFim - hInicio);
}

if (totalM < 0) {
    totalM = 60 + (mFim - mInicio);
    totalH--;
}

if (hInicio == hFim && mInicio == mFim) console.log('O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)');
else console.log('O JOGO DUROU '+ totalH + ' HORA(S) E ' + totalM + ' MINUTO(S)');