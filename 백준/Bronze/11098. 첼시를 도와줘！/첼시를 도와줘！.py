cnt = int(input())

for i in range(cnt):
  p_cnt = int(input())

  mM = 0
  mN = ""
  for i in range(p_cnt):
    money, name = input().split()
    if int(money) > mM:
      mM = int(money);
      mN = name
      
  print(mN)