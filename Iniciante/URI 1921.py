N = None
resposta = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

N = read_integer()
resposta = (N * (N - 3)) / 2
print(str(resposta) + str(''))