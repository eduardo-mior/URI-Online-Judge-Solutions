import math

resposta = None
N = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

N = read_numeric()
resposta = (((((math.pow(N, 4)) - 6 * (math.pow(N, 3))) + 23 * (math.pow(N, 2))) - 18 * N) + 24) / 24
print("{:0.0f}".format(resposta))
