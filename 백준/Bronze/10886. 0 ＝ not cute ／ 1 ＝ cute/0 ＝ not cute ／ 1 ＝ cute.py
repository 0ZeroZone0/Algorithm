count = int(input())
cnt_1 = 0
cnt_0 = 0
for _ in range(count):
  check = int(input())
  if(check == 1):
    cnt_1 += 1
  elif(check == 0):
    cnt_0 += 1
    
if(cnt_1 > cnt_0):
  print("Junhee is cute!")
else:
  print("Junhee is not cute!")