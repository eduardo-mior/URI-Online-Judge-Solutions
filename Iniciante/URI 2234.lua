line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
H = tonumber(line[1])
P = tonumber(line[2])

media = H / P
print(string.format('%.2f', media))