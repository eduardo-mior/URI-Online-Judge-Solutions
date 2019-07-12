salarioFixo = None
total = None
totalVendas = None
vendedor = None

def read_string():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

vendedor = read_string()
salarioFixo = read_numeric()
totalVendas = read_numeric()
total = (totalVendas * 15) / 100 + salarioFixo
print(str("TOTAL = R$ ") + str("{:0.2f}".format(total)))