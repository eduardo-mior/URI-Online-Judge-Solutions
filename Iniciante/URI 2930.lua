line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
e = tonumber(line[1])
d = tonumber(line[2])

if (e > d) then
    print('Eu odeio a professora!')
elseif ((d - e) >= 3) then
    print('Muito bem! Apresenta antes do Natal!')
elseif ((e + 2) < 24) then
    print('Parece o trabalho do meu filho!\nTCC Apresentado!')
else
    print('Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!')
end