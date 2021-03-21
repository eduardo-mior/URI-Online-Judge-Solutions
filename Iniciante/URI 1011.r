input = file('stdin', 'r')

pi = 3.14159
raio = as.double(readLines(input, n=1))
volume = ((4 * pi) * (raio ** 3)) / 3

write(sprintf("VOLUME = %.3f", volume), '')