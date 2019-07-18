pi = 3.14159
raio = tonumber(io.read())
volume = (4.0 / 3) * pi * math.pow(raio, 3.0)
print(string.format('VOLUME = %.3f', volume))