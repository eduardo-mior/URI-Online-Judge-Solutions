x = None
y = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
x = float((lista[0]))
y = float((lista[1]))
if x == 0 and y == 0:
  print("Origem")
elif x == 0:
  print("Eixo Y")
elif y == 0:
  print("Eixo X")
elif y > 0 and x > 0:
  print("Q1")
elif y > 0 and x < 0:
  print("Q2")
elif y < 0 and x < 0:
  print("Q3")
elif y < 0 and x > 0:
  print("Q4")