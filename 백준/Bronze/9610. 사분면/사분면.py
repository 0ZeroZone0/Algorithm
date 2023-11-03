count = int(input())
Q1 = Q2 = Q3 = Q4 = AXIS = 0

for i in range(count):
  X,Y = map(int, input().split())

  if X < 0 and Y < 0:
    Q3 += 1
  elif X > 0 and Y > 0:
    Q1 += 1
  elif X > 0 and Y < 0:
    Q4 += 1
  elif X < 0 and Y > 0:
    Q2 += 1
  else:
    AXIS += 1

print("Q1:", Q1) 
print("Q2:", Q2) 
print("Q3:", Q3) 
print("Q4:", Q4) 
print("AXIS:", AXIS) 