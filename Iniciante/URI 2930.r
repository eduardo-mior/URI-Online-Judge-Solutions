input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
e = as.integer(line[[1]][1])
d = as.integer(line[[1]][2])

if (e > d) {
    write("Eu odeio a professora!", '')
} else if ((d - e) >= 3) {
    write("Muito bem! Apresenta antes do Natal!", '')
} else if ((e + 2) < 24) {
    write("Parece o trabalho do meu filho!\nTCC Apresentado!", '')
} else {
    write("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!", '')
}