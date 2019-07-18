line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
T1 = tonumber(line[1])
T2 = tonumber(line[2])
T3 = tonumber(line[3])
T4 = tonumber(line[4])

totalTomadas = (T1 + T2 + T3 + T4) - 3
print(totalTomadas)