def add(bit, i, val, sz):
  while i <= sz:
    bit[i] += val
    i += i & -i

def query(bit, i):
  ret = 0
  while i > 0:
    ret += bit[i]
    i -= i & -i
  return ret

N = int(input())
arr = list(map(int, input().strip().split()))

bitleft = [0] * (N + 1)
bitright = [0] * (N + 1)

for i in range(2, N):
  add(bitright, arr[i], 1, N)

add(bitleft, arr[0], 1, N)

answer = 0
for i in range(1, N - 1):
  greaterLeft = query(bitleft, N) - query(bitleft, arr[i])
  lessRight = query(bitright, arr[i] - 1)

  answer += greaterLeft * lessRight
  add(bitleft, arr[i], 1, N)
  add(bitright, arr[i + 1], -1, N)
    
print(answer)