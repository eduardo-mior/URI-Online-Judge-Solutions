line = gets.split(' ')
hInicial = line[0].to_i
hFinal = line[1].to_i

if hInicial > hFinal
    puts "O JOGO DUROU #{24 - (hInicial - hFinal)} HORA(S)"
elsif hFinal > hInicial
    puts "O JOGO DUROU #{hFinal - hInicial} HORA(S)"
else
    puts "O JOGO DUROU 24 HORA(S)"
end