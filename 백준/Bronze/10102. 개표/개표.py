count = int(input())
vote = input()
count_A = 0
count_B = 0

for i in range(len(vote)):
  if(vote[i] == "A" ):
    count_A += 1
  elif vote[i] == "B":
    count_B += 1

if(count_A > count_B):
  print("A")
elif count_A <count_B:
  print("B")
else:
  print("Tie")