incio = None
final = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
inicio = int(lista[0])
final = int(lista[1])

if inicio >= 0 and final <= 2:
    print("nova")
elif final > inicio and final <= 96:
    print("crescente")
elif inicio >= final and final <= 96:
    print("minguante")
else:
    print("cheia")