line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
a = tonumber(line[1])
b = tonumber(line[2])
c = tonumber(line[3])
d = tonumber(line[4])

if (b > c and d > a and c > 0 and d > 0 and (c + d) > (a + b) and a % 2 == 0) then
	print('Valores aceitos')
else
	print('Valores nao aceitos')
end