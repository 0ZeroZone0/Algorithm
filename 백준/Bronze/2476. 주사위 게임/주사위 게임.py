count = int(input())
result = 0
money = []

for _ in range(count):
  A, B, C = map(int, input().split())
  if A == B == C :
    result = 10000 + A * 1000
  elif A == B or B == C :
    result = 1000 + B * 100
  elif A == C :
    result = 1000 + C * 100
  else :
    result = max(A,B,C) * 100

  money.append(result)

print(max(money))