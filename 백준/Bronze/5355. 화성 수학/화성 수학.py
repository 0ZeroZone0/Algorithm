count = int(input())

for _ in range(count):
  marsList = list(map(str, input().split()))
  answer = 0

  for i in range(len(marsList)):
    if i == 0:
      answer += float(marsList[0])
    else:
      if marsList[i] == "@":
        answer *= 3
      if marsList[i] == "%":
        answer += 5
      if marsList[i] == "#":
        answer -= 7

  print("%0.2f" % answer)