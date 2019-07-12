salario = None
funcionarios = None
valorPorHora = None
horas = None

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

funcionarios = read_integer()
horas = read_integer()
valorPorHora = read_numeric()
salario = horas * valorPorHora
print(str("NUMBER = ") + str(funcionarios))
print(str("SALARY = U$ ") + str("{:0.2f}".format(salario)))