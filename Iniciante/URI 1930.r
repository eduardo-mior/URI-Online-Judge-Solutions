input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
t1 = as.integer(line[[1]][1])
t2 = as.integer(line[[1]][2])
t3 = as.integer(line[[1]][3])
t4 = as.integer(line[[1]][4])
totalTomadas = (t1 + t2 + t3 + t4) - 3;

write(sprintf("%d", totalTomadas), '')