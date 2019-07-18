media = None
P = None
H = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
H = float((lista[0]))
P = float((lista[1]))
media = H / P
print("{:0.2f}".format(media))