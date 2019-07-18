nome = gets.to_s
salarioFixo = gets.to_f
vendas = gets.to_f
total = ((vendas * 15) / 100) + salarioFixo
puts "TOTAL = R$ %.2f" % [total]