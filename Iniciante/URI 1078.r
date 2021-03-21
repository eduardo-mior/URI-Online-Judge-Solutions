input = file('stdin', 'r')

n = as.integer(readLines(input, n=1))

write(sprintf("1 x %d = %d", n, n * 1), '')
write(sprintf("2 x %d = %d", n, n * 2), '')
write(sprintf("3 x %d = %d", n, n * 3), '')
write(sprintf("4 x %d = %d", n, n * 4), '')
write(sprintf("5 x %d = %d", n, n * 5), '')
write(sprintf("6 x %d = %d", n, n * 6), '')
write(sprintf("7 x %d = %d", n, n * 7), '')
write(sprintf("8 x %d = %d", n, n * 8), '')
write(sprintf("9 x %d = %d", n, n * 9), '')
write(sprintf("10 x %d = %d", n, n * 10), '')