input = file('stdin', 'r')

n = as.integer(readLines(input, n=1))

for (i in 1:10000) {
    if (i %% n == 2) {
        write(i, '')
    }
}
