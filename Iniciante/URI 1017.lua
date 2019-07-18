tempo = tonumber(io.read())
velocidade = tonumber(io.read())
kilometros = tempo * velocidade
media = kilometros / 12
print(string.format('%.3f', media))