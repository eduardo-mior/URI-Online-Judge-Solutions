retangulo = None
quadrado = None
trapezio = None
circulo = None
triangulo = None
b = None
a = None
c = None
lista = None

def read_line():
  try:
    # read for Python 2.x
    return raw_input()
  except NameError:
    # read for Python 3.x
    return input()

lista = read_line().split(" ")
a = float((lista[0]))
b = float((lista[1]))
c = float((lista[2]))
triangulo = a * c / 2.0
circulo = 3.14159 * (c * c)
trapezio = ((a + b) * c) / 2.0
quadrado = b * b
retangulo = a * b
print(str("TRIANGULO: ") + str("{:0.3f}".format(triangulo)))
print(str("CIRCULO: ") + str("{:0.3f}".format(circulo)))
print(str("TRAPEZIO: ") + str("{:0.3f}".format(trapezio)))
print(str("QUADRADO: ") + str("{:0.3f}".format(quadrado)))
print(str("RETANGULO: ") + str("{:0.3f}".format(retangulo)))