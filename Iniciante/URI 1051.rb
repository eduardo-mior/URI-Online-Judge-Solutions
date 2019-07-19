salario = gets.to_f
if salario >= 0.0 && salario <= 2000.0
    puts "Isento"
elsif salario > 2000.0 && salario <= 3000.0
    puts "R$ %.2f" % [(salario - 2000.0) * 0.08]
elsif salario > 3000.0 && salario <= 4500.0
    puts "R$ %.2f" % [((salario - 3000.0)  * 0.18) + 80]
else
    puts "R$ %.2f" % [((salario - 4500.0) * 0.28) + 350]
end