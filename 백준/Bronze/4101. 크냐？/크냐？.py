while True:
  X, Y = map(int, input().split())

  if X == 0 and Y == 0:
    break
  elif X > Y:
    print("Yes")
  else:
    print("No")
