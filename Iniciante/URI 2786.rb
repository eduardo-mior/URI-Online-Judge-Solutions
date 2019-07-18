L = gets.to_i 
C = gets.to_i
lajes1 = (L * C) + ((L - 1) * (C - 1))
lajes2 = ((L - 1) * 2) + ((C - 1) * 2)
puts "#{lajes1}"
puts "#{lajes2}"