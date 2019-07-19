salario = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

salario = read_numeric()
if salario >= 0 and salario <= 2000:
  print("Isento")
elif salario > 2000 and salario <= 3000:
  print(str("R$ ") + str("{:0.2f}".format(((salario - 2000) * 0.08))))
elif salario > 3000 and salario <= 4500:
  print(str("R$ ") + str("{:0.2f}".format(((salario - 3000) * 0.18 + 80))))
else:
  print(str("R$ ") + str("{:0.2f}".format(((salario - 4500) * 0.28 + 350))))