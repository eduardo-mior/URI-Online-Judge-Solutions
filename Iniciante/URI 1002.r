input = file('stdin', 'r')

raio = as.double(readLines(input, n=1))
area = 3.14159 * (raio * raio);

write(sprintf("A=%.4f", area), '')