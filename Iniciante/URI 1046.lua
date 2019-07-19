line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
hInicial = tonumber(line[1])
hFinal = tonumber(line[2])

if (hInicial > hFinal) then
    print('O JOGO DUROU ' .. (24 - (hInicial - hFinal)) .. ' HORA(S)')
elseif (hFinal > hInicial) then
    print('O JOGO DUROU ' .. (hFinal - hInicial) .. ' HORA(S)')
else
    print('O JOGO DUROU 24 HORA(S)')
end