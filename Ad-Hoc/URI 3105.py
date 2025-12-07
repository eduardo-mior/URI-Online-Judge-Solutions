import sys

def main():
    line = sys.stdin.read().split()
    if not line:
        return
    
    n = int(line[0])
    m = int(line[1])
    k = int(line[2])
    
    min_g = n if n > m else m
    
    for a in range(1, k + 1):
        b = k // a
        
        dim_n = (n + a - 1) // a
        dim_m = (m + b - 1) // b
        
        local_max = dim_n if dim_n > dim_m else dim_m
        
        if local_max < min_g:
            min_g = local_max
            
    print(min_g)

if __name__ == "__main__":
    main()