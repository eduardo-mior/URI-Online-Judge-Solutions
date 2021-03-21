input = file('stdin', 'r')

a = as.double(readLines(input, n=1)) * 3.5
b = as.double(readLines(input, n=1)) * 7.5
media = (a + b) / 11

write(sprintf("MEDIA = %.5f", media), '')