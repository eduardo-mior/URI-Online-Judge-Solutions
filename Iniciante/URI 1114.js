var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let acessoLiberado = false
while(acessoLiberado != true) {
    let tentativa = lines.shift()
    if (tentativa == 2002) {
        console.log("Acesso Permitido")
        acessoLiberado = true
    } else {
        console.log("Senha Invalida")
    }
}