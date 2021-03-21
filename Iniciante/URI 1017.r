input = file('stdin', 'r')

tempo = as.integer(readLines(input, n=1))
velocidade = as.double(readLines(input, n=1))

kilometros = tempo * velocidade
media = kilometros / 12

write(sprintf("%.3f", media), '')