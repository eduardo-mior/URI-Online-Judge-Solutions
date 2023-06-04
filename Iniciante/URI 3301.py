h, z, l = map(int, input().split())
if ((h > z) & (h < l)) or ((h < z) & (h > l)):
    print("huguinho")
elif ((z > h) & (z < l)) or ((z < h) & (z > l)):
    print("zezinho")
else:
    print("luisinho")
