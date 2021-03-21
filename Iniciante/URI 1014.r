input = file('stdin', 'r')

x = as.integer(readLines(input, n=1))
y = as.double(readLines(input, n=1))
media = x / y

write(sprintf("%.3f km/l", media), '')