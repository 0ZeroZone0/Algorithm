tot = int(input())
remain_tot = 0
for _ in range(tot):
  a,b = map(int,input().split())
  remain_tot += b%a

print(remain_tot)