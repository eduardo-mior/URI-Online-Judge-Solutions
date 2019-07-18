line = gets.split(' ')
A = line[0].to_f
B = line[1].to_f
aumento = (B * 100.0 / A) - 100.0
puts "%.2f%%" % [aumento]