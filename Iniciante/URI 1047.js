var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

let line = lines.shift().split(" ");

let hoursInitial = parseInt(line[0]);
let minuteInitial = parseInt(line[1]);
let hoursFinal = parseInt(line[2]);
let minuteFinal = parseInt(line[3]);

let minutes = 0;
let hours = 0;

if (
  hoursInitial == hoursFinal &&
  minuteInitial == minuteFinal &&
  hoursInitial == minuteFinal
) {
  console.log("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
} else {
  if (hoursInitial > hoursFinal) {
    hours = 24 - hoursInitial + hoursFinal;
  } else if (hoursInitial < hoursFinal) {
    hours = 24 - (24 - hoursFinal + hoursInitial);
  }
  if (minuteInitial > minuteFinal) {
    minutes = 60 + minuteFinal - minuteInitial;
    if (hoursInitial == hoursFinal) {
      hours = 24 + hours - 1;
    } else {
      hours = hours - 1;
    }
  } else {
    minutes = minuteFinal - minuteInitial;
  }
  console.log(`O JOGO DUROU ${hours} HORA(S) E ${minutes} MINUTO(S)`);
}
