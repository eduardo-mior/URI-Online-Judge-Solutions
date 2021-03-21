input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
a = as.double(line[[1]][1])
b = as.double(line[[1]][2])
aumento = (b * 100.0 / a) - 100.0;

write(sprintf("%.2f%%", aumento), '')