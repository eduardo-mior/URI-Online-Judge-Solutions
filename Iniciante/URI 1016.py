minutos = None
km = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

km = read_integer()
minutos = (60 * km) / 30
print(str(minutos) + str(" minutos"))
