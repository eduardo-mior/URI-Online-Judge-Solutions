import math
import sys

def calcular_mmc(x, y):
    if x == 0 or y == 0: return 0
    return abs(x * y) // math.gcd(x, y)

def solve():
    entrada = sys.stdin.read().split()
    iterator = iter(entrada)
    
    while True:
        try:
            t = int(next(iterator))
            a = int(next(iterator))
            b = int(next(iterator))
            
            if t == 0 and a == 0 and b == 0:
                break
            
            resultados = []
            mmc_ab = calcular_mmc(a, b)
            
            if t % mmc_ab != 0:
                print()
                continue
                
            divisores = []
            for i in range(1, int(math.isqrt(t)) + 1):
                if t % i == 0:
                    divisores.append(i)
                    if i * i != t:
                        divisores.append(t // i)
            
            for c in divisores:
                if calcular_mmc(mmc_ab, c) == t:
                    resultados.append(c)
            
            resultados.sort()
            print(*resultados)
            
        except StopIteration:
            break

if __name__ == "__main__":
    solve()