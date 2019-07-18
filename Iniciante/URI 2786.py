lajes2 = None
lajes1 = None
C = None
L = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

L = read_integer()
C = read_integer()
lajes1 = L * C + (L - 1) * (C - 1)
lajes2 = (L - 1) * 2 + (C - 1) * 2
print(lajes1)
print(lajes2)