input = file('stdin', 'r')

line1 = strsplit(readLines(input, n=1), " ")
x1 = as.double(line1[[1]][1])
y1 = as.double(line1[[1]][2])

line2 = strsplit(readLines(input, n=1), " ")
x2 = as.double(line2[[1]][1])
y2 = as.double(line2[[1]][2])

distancia = sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))
write(sprintf("%.4f", distancia), '')