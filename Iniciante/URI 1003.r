input = file('stdin', 'r')

a = as.integer(readLines(input, n=1))
b = as.integer(readLines(input, n=1))
soma = a + b

write(sprintf("SOMA = %d", soma), '')