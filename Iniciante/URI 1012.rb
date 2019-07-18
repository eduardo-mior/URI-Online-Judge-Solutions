line = gets.split(' ')
a = line[0].to_f
b = line[1].to_f
c = line[2].to_f

triangulo = a * c / 2.0
circulo = 3.14159 * (c * c)
trapezio = ((a  + b) * c  ) / 2.0
quadrado = b * b
retangulo = a * b

puts "TRIANGULO: %.3f" % [triangulo]
puts "CIRCULO: %.3f" % [circulo]
puts "TRAPEZIO: %.3f" % [trapezio]
puts "QUADRADO: %.3f" % [quadrado]
puts "RETANGULO: %.3f" % [retangulo]