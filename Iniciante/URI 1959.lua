line = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line[n] = i
end
N = tonumber(line[1])
L = tonumber(line[2])

P = N * L
print(P)