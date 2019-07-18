line1 = gets.split(' ')
x1 = line1[0].to_f
y1 = line1[1].to_f

line2 = gets.split(' ')
x2 = line2[0].to_f
y2 = line2[1].to_f

distancia = Math.sqrt(((x2 - x1) ** 2.0) + ((y2 - y1) ** 2.0))
puts "%.4f" % [distancia]