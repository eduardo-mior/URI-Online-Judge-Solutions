input = file('stdin', 'r')

valor = as.double(readLines(input, n=1))

if (valor >= 0 && valor <= 25) {
    write("Intervalo [0,25]", '')
} else if (valor > 25 && valor <= 50) { 
    write("Intervalo (25,50]", '')
} else if (valor > 50 && valor <= 75) { 
    write("Intervalo (50,75]", '')
} else if (valor > 75 && valor <= 100) { 
    write("Intervalo (75,100]", '')
} else { 
    write("Fora de intervalo", '')
}