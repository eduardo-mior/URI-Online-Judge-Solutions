input = file('stdin', 'r')

a = as.double(readLines(input, n=1))
b = as.double(readLines(input, n=1))
c = as.double(readLines(input, n=1))
d = as.double(readLines(input, n=1))
diferenca = a * b - c * d

write(sprintf("DIFERENCA = %d", diferenca), '')