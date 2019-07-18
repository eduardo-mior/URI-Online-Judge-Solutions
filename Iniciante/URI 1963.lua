line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
A = tonumber(line[1])
B = tonumber(line[2])

aumento = (B * 100.0 / A) - 100.0
print(string.format('%.2f%%', aumento))