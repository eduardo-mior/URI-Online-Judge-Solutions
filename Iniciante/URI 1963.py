aumento = None
A = None
B = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
A = float((lista[0]))
B = float((lista[1]))
aumento = (B * 100) / A - 100
print(str("{:0.2f}".format(aumento)) + str("%"))