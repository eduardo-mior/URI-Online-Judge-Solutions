line1 = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line1[n] = i
end
cod1 = tonumber(line1[1])
n1 = tonumber(line1[2])
valor1 = tonumber(line1[3])

line2 = {}
n = 0
for i in string.gmatch(io.read("*l"), "%S+") do
   n = n + 1
   line2[n] = i
end
cod2 = tonumber(line2[1])
n2 = tonumber(line2[2])
valor2 = tonumber(line2[3])

total = (n1 * valor1) + (n2 * valor2)
print(string.format('VALOR A PAGAR: R$ %.2f', total))