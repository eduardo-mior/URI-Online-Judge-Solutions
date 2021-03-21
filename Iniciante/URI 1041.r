input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
x = as.double(line[[1]][1])
y = as.double(line[[1]][2])

if (x == 0 && y == 0) {
    write(sprintf("Origem"), '')
} else if (x == 0) {
    write(sprintf("Eixo Y"), '')
} else if (y == 0) {
    write(sprintf("Eixo X"), '')
} else if (y > 0 && x > 0) {
    write(sprintf("Q1"), '')
} else if (y > 0 && x < 0) {
    write(sprintf("Q2"), '')
} else if (y < 0 && x < 0) {
    write(sprintf("Q3"), '')
} else if (y < 0 && x > 0) {
    write(sprintf("Q4"), '')
}