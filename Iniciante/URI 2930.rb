line = gets.split(' ')
e = line[0].to_i
d = line[1].to_i

if e > d
    puts "Eu odeio a professora!"
elsif (d - e) >= 3
    puts "Muito bem! Apresenta antes do Natal!"
elsif (e + 2) < 24
    puts "Parece o trabalho do meu filho!\nTCC Apresentado!"
else
    puts "Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!"
end