line1 = gets.split(' ')
cod = line1[0].to_i
n1 = line1[1].to_i
valor1 = line1[2].to_f

line2 = gets.split(' ')
cod2 = line2[0].to_i
n2 = line2[1].to_i
valor2 = line2[2].to_f

total = (n1 * valor1) + (n2 * valor2)
puts "VALOR A PAGAR: R$ %.2f" % [total]