A = None
B = None
SOMA = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

A = read_integer()
B = read_integer()
SOMA = A + B
print(str("SOMA = ") + str(SOMA))