line = gets.split(' ')
T1 = line[0].to_i
T2 = line[1].to_i
T3 = line[2].to_i
T4 = line[3].to_i

total = totalTomadas = (T1 + T2 + T3 + T4) - 3
puts "#{totalTomadas}"