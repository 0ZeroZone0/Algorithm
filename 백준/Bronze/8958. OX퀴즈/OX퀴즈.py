count = int(input())

for i in range(count):
  OX_word = str(input())
  O_cnt = 0
  O_total_cnt = 0

  for i in range(len(OX_word)):
    if OX_word[i] == "O":
      O_cnt += 1
      O_total_cnt += O_cnt
    else:
      O_cnt = 0
  print(O_total_cnt)