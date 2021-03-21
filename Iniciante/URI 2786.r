input = file('stdin', 'r')

l = as.integer(readLines(input, n=1))
c = as.integer(readLines(input, n=1))

lajes1 = (l * c) + ((l - 1) * (c - 1))
lajes2 = ((l - 1) * 2) + ((c - 1) * 2)

write(lajes1, '')
write(lajes2, '')