media = None
X = None
Y = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

X = read_integer()
Y = read_numeric()
media = X / Y
print(str("{:0.3f}".format(media)) + str(" km/l"))
