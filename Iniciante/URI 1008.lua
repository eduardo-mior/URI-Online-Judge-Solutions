funcionarios = tonumber(io.read())
horas = tonumber(io.read())
valorPorHora = tonumber(io.read())
salario = horas * valorPorHora
print('NUMBER = ' .. funcionarios)
print(string.format('SALARY = U$ %.2f', salario))