input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
h = as.integer(line[[1]][1])
p = as.integer(line[[1]][2])
media = h / p

write(sprintf("%.2f", media), '')