totNum = int(input())
A = B = C = 0

if totNum % 10 != 0:
  print(-1)
else :
  A = totNum // 300
  B = (totNum % 300) // 60
  C = (totNum % 300) % 60 // 10
  print(A, B, C)