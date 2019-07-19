salario = tonumber(io.read())
if (salario >= 0.0 and salario <= 2000.0) then
    print('Isento')
elseif (salario > 2000.0 and salario <= 3000.0) then
    print(string.format('R$ %.2f', (salario - 2000.0) * 0.08))
elseif (salario > 3000.0 and salario <= 4500.0) then
    print(string.format('R$ %.2f', ((salario - 3000.0)  * 0.18) + 80))
else
    print(string.format('R$ %.2f', ((salario - 4500.0) * 0.28) + 350))
end