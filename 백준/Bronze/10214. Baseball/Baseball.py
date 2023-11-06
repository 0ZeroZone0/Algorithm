count = int(input())

for _ in range(count):
  Y = K = 0
  for _ in range(9):
    A,B = map(int,input().split())
    Y += A
    K += B

  if Y == K :
    print("Draw")
  elif Y > K :
    print("Yonsei")
  elif K > Y :
    print("Korea")
