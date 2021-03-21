input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
valor1 = as.integer(line[[1]][1])
valor2 = as.integer(line[[1]][2])
valor3 = as.integer(line[[1]][3])

if (valor1 > valor2 && valor1 > valor3) {
    write(sprintf("%d eh o maior", valor1), '')
} else if (valor2 > valor3) {
    write(sprintf("%d eh o maior", valor2), '')
} else {
    write(sprintf("%d eh o maior", valor3), '')
}