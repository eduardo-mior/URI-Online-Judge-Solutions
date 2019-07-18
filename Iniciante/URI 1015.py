import math

distancia = None
y1 = None
y2 = None
x1 = None
x2 = None
lista2 = None
lista1 = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista1 = read_line().split(" ")
lista2 = read_line().split(" ")
x1 = float((lista1[0]))
y1 = float((lista1[1]))
x2 = float((lista2[0]))
y2 = float((lista2[1]))
distancia = math.sqrt(((math.pow((x2 - x1), 2)) + (math.pow((y2 - y1), 2))))
print(str("{:0.4f}".format(distancia)) + str(''))
