input = file('stdin', 'r')

km = as.integer(readLines(input, n=1))
minutos = (60 * km) / 30

write(sprintf("%d minutos", minutos), '')