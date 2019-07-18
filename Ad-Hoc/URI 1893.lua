line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
inicio = tonumber(line[1])
final = tonumber(line[2])

if (inicio >= 0 and final <= 2) then
	print('nova')
elseif (final > inicio and final <= 96) then
	print('crescente')
elseif (inicio >= final and final <= 96) then
	print('minguante')
else
	print('cheia')
end