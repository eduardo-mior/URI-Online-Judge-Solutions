input = file('stdin', 'r')

funcionarios = as.integer(readLines(input, n=1))
horas = as.integer(readLines(input, n=1))
valorPorHora = as.double(readLines(input, n=1))
salario = horas * valorPorHora

write(sprintf("NUMBER = %d", funcionarios), '')
write(sprintf("SALARY = U$ %.2f", salario), '')