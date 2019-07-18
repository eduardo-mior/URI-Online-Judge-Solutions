line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
x = tonumber(line[1])
y = tonumber(line[2])

if (x == 0 and y == 0) then
    print('Origem')
elseif (x == 0) then
    print('Eixo Y')
elseif (y == 0) then
    print('Eixo X')
elseif (y > 0 and x > 0) then
    print('Q1')
elseif (y > 0 and x < 0) then
    print('Q2')
elseif (y < 0 and x < 0) then
    print('Q3')
elseif (y < 0 and x > 0) then
    print('Q4')
end