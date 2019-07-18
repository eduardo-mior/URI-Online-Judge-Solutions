nome = tostring(io.read())
salarioFixo = tonumber(io.read())
vendas = tonumber(io.read())
total = ((vendas * 15) / 100) + salarioFixo
print(string.format('TOTAL = R$ %.2f', total))