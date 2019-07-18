line = gets.split(' ')
H = line[0].to_f
P = line[1].to_f
media = H / P
puts "%.2f" % [media]