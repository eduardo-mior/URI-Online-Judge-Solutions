input = file('stdin', 'r')

nome = readLines(input, n=1)
if (nchar(nome) > 80) {
    write("NO", '')
} else {
    write("YES", '')
}