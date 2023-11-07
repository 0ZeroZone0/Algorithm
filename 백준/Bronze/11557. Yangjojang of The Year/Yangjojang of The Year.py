tot_count = int(input())

for i in range(tot_count):
  school_cnt = int(input())
  school = []
  for i in range(school_cnt):
    name, score = map(str, input().split())
    school.append([name, int(score)])

  school = sorted(school, key=lambda x: x[1])

  print(school[-1][0])
