valor = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

valor = read_numeric()
if valor >= 0 and valor <= 25:
  print("Intervalo [0,25]")
elif valor > 25 and valor <= 50:
  print("Intervalo (25,50]")
elif valor > 50 and valor <= 75:
  print("Intervalo (50,75]")
elif valor > 75 and valor <= 100:
  print("Intervalo (75,100]")
else:
  print("Fora de intervalo")