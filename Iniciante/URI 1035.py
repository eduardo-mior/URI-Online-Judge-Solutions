a = None
b = None
c = None
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
a = int(lista[0])
b = int(lista[1])
c = int(lista[2])
d = int(lista[3])

if b > c and d > a and c > 0 and d > 0 and (c + d) > (a + b) and a % 2 == 0:
    print("Valores aceitos")
else:
    print("Valores nao aceitos")