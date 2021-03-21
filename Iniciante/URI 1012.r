input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
a = as.double(line[[1]][1])
b = as.double(line[[1]][2])
c = as.double(line[[1]][3])

triangulo = a * c / 2.0
circulo = 3.14159 * (c * c)
trapezio = ((a + b) * c) / 2.0
quadrado = b * b
retangulo = a * b

write(sprintf("TRIANGULO: %.3f", triangulo), '')
write(sprintf("CIRCULO: %.3f", circulo), '')
write(sprintf("TRAPEZIO: %.3f", trapezio), '')
write(sprintf("QUADRADO: %.3f", quadrado), '')
write(sprintf("RETANGULO: %.3f", retangulo), '')