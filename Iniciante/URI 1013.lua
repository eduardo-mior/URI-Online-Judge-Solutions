line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
valor1 = tonumber(line[1])
valor2 = tonumber(line[2])
valor3 = tonumber(line[3])

if (valor1 > valor2 and valor1 > valor3) then
	print(valor1 .. ' eh o maior')
elseif (valor2 > valor3) then
	print(valor2 .. ' eh o maior')
else 
	print(valor3 .. ' eh o maior')
end