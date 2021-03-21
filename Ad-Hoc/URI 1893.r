input = file('stdin', 'r')

line = strsplit(readLines(input, n=1), " ")
inicio = as.integer(line[[1]][1])
final = as.integer(line[[1]][2])

if (inicio >= 0 && final <= 2) {
    write("nova", '')
} else if (final > inicio && final <= 96) {
    write("crescente", '')
} else if (inicio >= final && final <= 96) {
    write("minguante", '')
} else { 
    write("cheia", '')
}