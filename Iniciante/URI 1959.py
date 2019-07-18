L = None
N = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
N = int((lista[0]))
L = int((lista[1]))
print(N * L)