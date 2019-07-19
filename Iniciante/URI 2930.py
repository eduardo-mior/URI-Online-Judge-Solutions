e = None
d = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
e = int((lista[0]))
d = int((lista[1]))
if e > d:
  print("Eu odeio a professora!")
elif (d - e) >= 3:
  print("Muito bem! Apresenta antes do Natal!")
elif (e + 2) < 24:
  print("Parece o trabalho do meu filho!\nTCC Apresentado!")
else:
  print("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!")