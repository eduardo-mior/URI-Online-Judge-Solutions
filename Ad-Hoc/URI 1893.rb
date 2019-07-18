line = gets.split(' ')
inicio = line[0].to_i
final = line[1].to_i

if inicio >= 0 && final <= 2
	puts "nova"
elsif final > inicio && final <= 96
	puts "crescente"
elsif inicio >= final && final <= 96
	puts "minguante"
else 
	puts "cheia"
end