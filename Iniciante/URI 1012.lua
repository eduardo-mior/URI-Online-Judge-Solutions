line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
a = tonumber(line[1])
b = tonumber(line[2])
c = tonumber(line[3])

triangulo = a * c / 2.0
circulo = 3.14159 * (c * c)
trapezio = ((a  + b) * c  ) / 2.0
quadrado = b * b
retangulo = a * b

print(string.format("TRIANGULO: %.3f", triangulo))
print(string.format("CIRCULO: %.3f", circulo))
print(string.format("TRAPEZIO: %.3f", trapezio))
print(string.format("QUADRADO: %.3f", quadrado))
print(string.format("RETANGULO: %.3f", retangulo)) 