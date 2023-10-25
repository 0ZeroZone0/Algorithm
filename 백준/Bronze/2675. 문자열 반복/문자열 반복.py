count = int(input())
for i in range(count):
  A, B = map(str, input().split())
  answer = ""

  if B is None:
    pass
  else:
    for i in range(len(B)):
      answer += B[i] * int(A)

  print(answer)