valor = gets.to_f
if valor >= 0 && valor <= 25
	puts "Intervalo [0,25]"
elsif valor > 25 && valor <= 50
	puts "Intervalo (25,50]"
elsif valor > 50 && valor <= 75
	puts "Intervalo (50,75]"
elsif valor > 75 && valor <= 100
	puts "Intervalo (75,100]"
else
	puts "Fora de intervalo"
end