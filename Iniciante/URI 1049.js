var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let firstWord = lines.shift()
let secondWord = lines.shift()
let thirdWord = lines.shift()
if (firstWord == 'vertebrado') {
    if (secondWord == 'ave') {
        if (thirdWord == 'carnivoro') {
            console.log("aguia")
        } else if (thirdWord == 'onivoro') {
            console.log("pomba")
        }
    } else if (secondWord == 'mamifero') {
        if (thirdWord == 'onivoro') {
            console.log("homem")
        } else if (thirdWord == 'herbivoro') {
            console.log("vaca")
        }
    }
} else if (firstWord == 'invertebrado') {
    if (secondWord == 'inseto') {
        if (thirdWord == 'hematofago') {
            console.log("pulga")
        } else if (thirdWord == 'herbivoro') {
            console.log("lagarta")
        }
    } else if (secondWord == 'anelideo') {
        if (thirdWord == 'hematofago') {
            console.log("sanguessuga")
        } else if (thirdWord == 'onivoro') {
            console.log("minhoca")
        }
    }
}