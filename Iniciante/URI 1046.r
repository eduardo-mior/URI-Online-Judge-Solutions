input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
hInicial = as.integer(line[[1]][1])
hFinal = as.integer(line[[1]][2])

if (hInicial > hFinal) { 
    write(sprintf("O JOGO DUROU %d HORA(S)", 24 - (hInicial - hFinal)), '')
} else if (hFinal > hInicial) {
    write(sprintf("O JOGO DUROU %d HORA(S)", (hFinal - hInicial)), '')
} else {
   write(sprintf("O JOGO DUROU 24 HORA(S)"), '');
}