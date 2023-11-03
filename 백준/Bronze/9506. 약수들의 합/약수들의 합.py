while True:
  num = int(input())
  numList = []
  if num == -1:
    break

  for i in range(1, num):
    if num % i == 0:
      numList.append(i)

  total_num = 0
  for i in range(len(numList)):
    total_num += numList[i]

  if total_num == num:
    print("{} = ".format(num), ' + '.join(str(i) for i in numList), sep="")
  else:
    print("{} is NOT perfect.".format(num))