A, B ,C = map(int,input().split())

result  = A*B - C

if(result < 1):
  result=0
  
print(result)