input = file('stdin', 'r')

line1 = strsplit(readLines(input, n=1), " ")
cod1 = as.integer(line1[[1]][1])
n1 = as.integer(line1[[1]][2])
valor1 = as.double(line1[[1]][3])

line2 = strsplit(readLines(input, n=1), " ")
cod2 = as.integer(line2[[1]][1])
n2 = as.integer(line2[[1]][2])
valor2 = as.double(line2[[1]][3])

total = (n1 * valor1) + (n2 * valor2)
write(sprintf("VALOR A PAGAR: R$ %.2f", total), '')