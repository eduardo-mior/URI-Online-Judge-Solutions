line = gets.split(' ')
x = line[0].to_f
y = line[1].to_f

if x == 0 && y == 0
    puts "Origem"
elsif x == 0
    puts "Eixo Y"
elsif y == 0
    puts "Eixo X"
elsif y > 0 && x > 0
    puts "Q1"
elsif y > 0 && x < 0
    puts "Q2"
elsif y < 0 && x < 0
    puts "Q3"
elsif y < 0 && x > 0
    puts "Q4"
end