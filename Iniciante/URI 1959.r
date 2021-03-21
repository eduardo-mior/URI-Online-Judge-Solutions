input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
n = as.double(line[[1]][1])
l = as.double(line[[1]][2])
p = n * l

write(sprintf("%.0f", p), '')