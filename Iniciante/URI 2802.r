input = file('stdin', 'r')

n = as.double(readLines(input, n=1))
resposta = ((n ** 4.0) - (6.0 * (n ** 3.0)) + (23.0 * (n ** 2.0)) - (18.0 * n) + 24.0 ) / 24.0

write(sprintf("%.0f", resposta), '')
