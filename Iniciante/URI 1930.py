totalTomadas = None
T4 = None
T3 = None
T2 = None
T1 = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
T1 = int((lista[0]))
T2 = int((lista[1]))
T3 = int((lista[2]))
T4 = int((lista[3]))
totalTomadas = (((T1 + T2) + T3) + T4) - 3
print(totalTomadas)