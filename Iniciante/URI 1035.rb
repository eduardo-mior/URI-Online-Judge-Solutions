line = gets.split(' ')
a = line[0].to_i
b = line[1].to_i
c = line[2].to_i
d = line[3].to_i

if b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0
	puts "Valores aceitos"
else 
	puts "Valores nao aceitos"
end