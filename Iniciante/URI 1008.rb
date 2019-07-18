funcionarios = gets.to_i 
horas = gets.to_i
valorPorHora = gets.to_f
salario = horas * valorPorHora
puts "NUMBER = #{funcionarios}"
puts "SALARY = U$ %.2f" % [salario]