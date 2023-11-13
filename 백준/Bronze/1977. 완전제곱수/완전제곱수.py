M = int(input())
N = int(input())
num_list =[]

for i in range(M, N+1):
  if i == int(i**0.5) **2:
    num_list.append(i)

if num_list:
  print(sum(num_list))
  print(min(num_list))
else:
  print(-1)