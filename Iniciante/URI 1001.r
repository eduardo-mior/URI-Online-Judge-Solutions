input = file('stdin', 'r')

a = as.integer(readLines(input, n=1))
b = as.integer(readLines(input, n=1))
x = a + b

write(paste("X =", x), '')