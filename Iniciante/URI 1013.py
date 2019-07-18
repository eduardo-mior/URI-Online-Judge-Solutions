valor1 = None
valor2 = None
valor3 = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
valor1 = int(lista[0])
valor2 = int(lista[1])
valor3 = int(lista[2])

if valor1 > valor2 and valor1 > valor3:
	print(str(valor1) + " eh o maior")
elif valor2 > valor3:
	print(str(valor2) + " eh o maior")
else:
	print(str(valor3) + " eh o maior")