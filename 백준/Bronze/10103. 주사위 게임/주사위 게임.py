count = int(input())
A_tot = 100
B_tot = 100

for _ in range(count):
  A,B = map(int,input().split())
  
  if A == B :
    pass
  elif A > B :
    B_tot -= A
  elif B > A :
    A_tot -= B

print(A_tot)
print(B_tot)