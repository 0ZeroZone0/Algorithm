def lcm(A, B):
  result = A * B // gcd(A, B)
  return result


def gcd(A, B):
  if B == 0:
    return A
  else:
    return gcd(B, A % B)


count = int(input())

for _ in range(count):
  A, B = map(int, input().split())
  print(lcm(A, B))
