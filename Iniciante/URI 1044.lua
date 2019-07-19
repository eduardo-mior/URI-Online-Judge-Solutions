line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
a = tonumber(line[1])
b = tonumber(line[2])

if (a % b == 0 or b % a == 0) then
    print('Sao Multiplos')
else
    print('Nao sao Multiplos')
end