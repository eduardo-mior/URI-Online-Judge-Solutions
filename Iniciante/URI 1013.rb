line = gets.split(' ')
valor1 = line[0].to_i
valor2 = line[1].to_i
valor3 = line[2].to_i

if valor1 > valor2 && valor1 > valor3
    puts "#{valor1} eh o maior"
elsif valor2 > valor3
    puts "#{valor2} eh o maior"
else
    puts "#{valor3} eh o maior"
end