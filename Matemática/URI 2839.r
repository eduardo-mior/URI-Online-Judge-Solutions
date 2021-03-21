input = file('stdin', 'r')

meias = as.integer(readLines(input, n=1))

write(sprintf("%d", meias + 1), '')