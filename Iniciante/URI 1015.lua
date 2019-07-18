line1 = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line1[n] = i
end
x1 = tonumber(line1[1])
y1 = tonumber(line1[2])

line2 = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line2[n] = i
end
x2 = tonumber(line2[1])
y2 = tonumber(line2[2])

distancia = math.sqrt(math.pow((x2 - x1), 2.0) + math.pow((y2 - y1), 2.0))
print(string.format('%.4f', distancia))