PROD = None
X = None
Y = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

X = read_integer()
Y = read_integer()
PROD = X * Y
print(str("PROD = ") + str(PROD))