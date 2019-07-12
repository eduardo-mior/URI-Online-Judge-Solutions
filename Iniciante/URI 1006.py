A = None
B = None
C = None
MEDIA = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

A = read_numeric()
B = read_numeric()
C = read_numeric()
MEDIA = (A * 2 + (B * 3 + C * 5)) / 10
print(str("MEDIA = ") + str("{:0.1f}".format(MEDIA)))