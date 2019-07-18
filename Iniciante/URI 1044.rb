line = gets.split(' ')
a = line[0].to_i
b = line[1].to_i

if a % b == 0 || b % a == 0
	puts "Sao Multiplos"
else 
	puts "Nao sao Multiplos"
end