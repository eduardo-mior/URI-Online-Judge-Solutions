A = None
B = None
MEDIA = None

def read_numeric():
  try:
    # read for Python 2.x
    return float(raw_input())
  except NameError:
    # read for Python 3.x
    return float(input())

A = read_numeric() * 3.5
B = read_numeric() * 7.5
MEDIA = (A + B) / 11
print(str("MEDIA = ") + str("{:0.5f}".format(MEDIA)))