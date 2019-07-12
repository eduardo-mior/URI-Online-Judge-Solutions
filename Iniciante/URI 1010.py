total = None
valor2 = None
n2 = None
valor1 = None
n1 = None
lista = None
cod2 = None
cod1 = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
cod1 = int((lista[0]))
n1 = int((lista[1]))
valor1 = float((lista[2]))
lista = read_line().split(" ")
cod2 = int((lista[0]))
n2 = int((lista[1]))
valor2 = float((lista[2]))
total = n1 * valor1 + n2 * valor2
print(str("VALOR A PAGAR: R$ ") + str("{:0.2f}".format(total)))
