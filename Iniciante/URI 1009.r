input = file('stdin', 'r')

vendedor = readLines(input, n=1)
salarioFixo = as.double(readLines(input, n=1))
totalVendas = as.double(readLines(input, n=1))
total = (totalVendas * 15) / 100 + salarioFixo

write(sprintf("TOTAL = R$ %.2f", total), '')