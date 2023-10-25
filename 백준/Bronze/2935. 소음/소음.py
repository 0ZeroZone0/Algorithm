A = int(input())
B = str(input())
C = int(input())

answer = 0

if B == "*":
  answer = A * C
if B == "+":
  answer = A + C

print(answer)
