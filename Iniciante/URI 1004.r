input = file('stdin', 'r')

x = as.integer(readLines(input, n=1))
y = as.integer(readLines(input, n=1))
prod = x * y

write(sprintf("PROD = %d", prod), '')