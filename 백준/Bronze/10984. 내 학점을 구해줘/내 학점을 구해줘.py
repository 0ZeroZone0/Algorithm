T = int(input())
for _ in range(T):
  tot_class = 0
  avg = 0
  num = int(input())
  for j in range(num):
    a,b = map(float, input().split())
    tot_class += int(a)
    avg += b * a

  result = avg/tot_class
  print(tot_class, '%.1f' %result)