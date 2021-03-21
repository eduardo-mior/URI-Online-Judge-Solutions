input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
a = as.integer(line[[1]][1])
b = as.integer(line[[1]][2])

if (a %% b == 0 || b %% a == 0) {
    write(sprintf("Sao Multiplos"), '')
} else { 
    write(sprintf("Nao sao Multiplos"), '')
}