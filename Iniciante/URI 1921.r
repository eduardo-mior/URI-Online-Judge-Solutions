input = file('stdin', 'r')

n = as.double(readLines(input, n=1))
resposta = (n * (n - 3)) / 2
write(sprintf("%0.f", resposta), '')