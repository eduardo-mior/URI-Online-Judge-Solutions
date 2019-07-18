import math

pi = None
raio = None
volume = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

pi = 3.14159
raio = read_numeric()
volume = ((4 * pi) * (math.pow(raio, 3))) / 3
print(str("VOLUME = ") + str("{:0.3f}".format(volume)))
