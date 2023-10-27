number = int(input())
sum = 0
result = 0

for i in range(1, number + 1):
  sum += i
  result += 1
  if sum > number:
    result -= 1
    break

print(result)