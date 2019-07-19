n = None

def read_integer():
  try:
    # read for Python 2.x
    return int(raw_input())
  except NameError:
    # read for Python 3.x
    return int(input())

n = read_integer()
print("1 x " + str(n) + " = " + str(n * 1))
print("2 x " + str(n) + " = " + str(n * 2))
print("3 x " + str(n) + " = " + str(n * 3))
print("4 x " + str(n) + " = " + str(n * 4))
print("5 x " + str(n) + " = " + str(n * 5))
print("6 x " + str(n) + " = " + str(n * 6))
print("7 x " + str(n) + " = " + str(n * 7))
print("8 x " + str(n) + " = " + str(n * 8))
print("9 x " + str(n) + " = " + str(n * 9))
print("10 x " + str(n) + " = " + str(n * 10))